package com.ithzzc.cloud.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ithzzc.cloud.common.constant.AdminConst;
import com.ithzzc.cloud.common.enums.StatusEnum;
import com.ithzzc.cloud.component.shiro.ShiroUtil;
import com.ithzzc.cloud.modules.system.entity.Menu;
import com.ithzzc.cloud.modules.system.entity.User;
import com.ithzzc.cloud.modules.system.enums.MenuTypeEnum;
import com.ithzzc.cloud.modules.system.service.IMenuService;
import com.ithzzc.cloud.modules.system.service.IUserService;

@Controller
public class MainController {


	@Autowired
	private IMenuService menuService;

	@GetMapping("/")
	public String main(Model model) {

		User user = ShiroUtil.getSubject();

		// 菜单键值对(ID->菜单)
		Map<Long, Menu> keyMenu = new HashMap<>();
		// 管理员实时更新菜单
		if (user.getId().equals(AdminConst.ADMIN_ID)) {
			List<Menu> menus = menuService.getListBySortOk();
			menus.forEach(menu -> keyMenu.put(menu.getId(), menu));
		} else {
			// 其他用户需从相应的角色中获取菜单资源
			user.getRoles().forEach(role -> {
				role.getMenus().forEach(menu -> {
					if (menu.getStatus().equals(StatusEnum.OK.getCode())) {
						keyMenu.put(menu.getId(), menu);
					}
				});
			});
		}
		// 封装菜单树形数据
		Map<Long, Menu> treeMenu = new HashMap<>();
		keyMenu.forEach((id, menu) -> {
			if (!menu.getType().equals(MenuTypeEnum.NOT_MENU.getCode())) {
				if (keyMenu.get(menu.getPid()) != null) {
					keyMenu.get(menu.getPid()).getChildren().put(Long.valueOf(menu.getSort()), menu);
				} else {
					if (menu.getType().equals(MenuTypeEnum.TOP_LEVEL.getCode())) {
						treeMenu.put(Long.valueOf(menu.getSort()), menu);
					}
				}
			}
		});
		model.addAttribute("user", user);
		model.addAttribute("treeMenu", treeMenu);
		return "/main";
	}
    /**
     * 主页
     */
    @GetMapping("/index")
    public String index(Model model){
        return "/system/main/index";
    }
    /**
     * 跳转到个人信息页面
     */
    @GetMapping("/userInfo")
    public String toUserInfo(Model model){
        User user = ShiroUtil.getSubject();
        model.addAttribute("user", user);
        return "/system/main/userInfo";
    }
}
