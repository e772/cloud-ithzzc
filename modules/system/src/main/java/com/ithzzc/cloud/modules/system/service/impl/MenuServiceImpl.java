package com.ithzzc.cloud.modules.system.service.impl;

import com.ithzzc.cloud.modules.system.entity.Menu;
import com.ithzzc.cloud.modules.system.mapper.MenuMapper;
import com.ithzzc.cloud.modules.system.service.IMenuService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Mht
 * @since 2019-07-12
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

	@Override
	public List<Menu> getListBySortOk() {
		
		EntityWrapper<Menu> wrapper = new EntityWrapper<>();
		wrapper.isNotNull("id");
		return selectList(wrapper);
	}

	
}
