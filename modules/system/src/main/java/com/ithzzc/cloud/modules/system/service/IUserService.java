package com.ithzzc.cloud.modules.system.service;

import com.ithzzc.cloud.modules.system.entity.User;

import java.util.List;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Mht
 * @since 2019-07-12
 */
public interface IUserService extends IService<User> {
	User getByName(String username);
	Page<User> getPageList(User entity);
}
