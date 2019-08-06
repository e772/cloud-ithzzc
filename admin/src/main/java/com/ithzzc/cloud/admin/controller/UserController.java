package com.ithzzc.cloud.admin.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.ithzzc.cloud.common.utils.SpringContextUtil;
import com.ithzzc.cloud.component.fileUpload.config.properties.UploadProjectProperties;
import com.ithzzc.cloud.component.shiro.ShiroUtil;
import com.ithzzc.cloud.modules.system.entity.User;
import com.ithzzc.cloud.modules.system.service.IUserService;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Mht
 * @since 2019-07-12
 */
@Controller
@RequestMapping("/system/user")
public class UserController {
	
	@Autowired
	private IUserService userService;

	/**
	 * 列表页面
	 */
	@GetMapping("/index")
	@RequiresPermissions("system:user:index")
	public String index(Model model, User user) {

		Pagination page = PageHelper.getPagination();
		// 获取用户列表
		Page<User> list = userService.getPageList(user);

		// 封装数据
		model.addAttribute("list", list);
		model.addAttribute("page", list);
		model.addAttribute("dept", user);
		return "/system/user/index";
	}

	/**
	 * 跳转到个人信息页面
	 */
	@GetMapping("/userInfo")
	@RequiresPermissions("index")
	public String toUserInfo(Model model) {
		User user = ShiroUtil.getSubject();
		model.addAttribute("user", user);
		return "/system/main/userInfo";
	}

	/**
	 * 获取用户头像
	 */
	@GetMapping("/picture")
	public void picture(String p, HttpServletResponse response) throws IOException {
		String defaultPath = "/images/user-picture.jpg";
		if (!(StringUtils.isEmpty(p) || p.equals(defaultPath))) {
			UploadProjectProperties properties = SpringContextUtil.getBean(UploadProjectProperties.class);
			String fuPath = properties.getFilePath();
			String spPath = properties.getStaticPath().replace("*", "");
			String s = fuPath + p.replace(spPath, "");
			File file = new File(fuPath + p.replace(spPath, ""));
			if (file.exists()) {
				FileCopyUtils.copy(new FileInputStream(file), response.getOutputStream());
				return;
			}
		}
		Resource resource = new ClassPathResource("static" + defaultPath);
		FileCopyUtils.copy(resource.getInputStream(), response.getOutputStream());
	}
}
