package com.ithzzc.cloud.modules.system.service.impl;

import com.ithzzc.cloud.modules.system.entity.User;
import com.ithzzc.cloud.modules.system.mapper.UserMapper;
import com.ithzzc.cloud.modules.system.service.IUserService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Override
	public User getByName(String username) {
		EntityWrapper<User> wrapper = new EntityWrapper<>();
		wrapper.eq("username", username);
		User user = selectOne(wrapper);
		return user;
	}

	@Override
	public Page<User> getPageList(User entity) {
		
		Page<User> page = new Page<>();
		
		EntityWrapper<User> wrapper = new EntityWrapper<>();
		wrapper.setEntity(entity);
		
		return selectPage(page, wrapper);
	}

}
