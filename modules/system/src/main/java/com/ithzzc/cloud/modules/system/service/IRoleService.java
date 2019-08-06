package com.ithzzc.cloud.modules.system.service;

import com.ithzzc.cloud.modules.system.entity.Role;

import java.util.Set;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Mht
 * @since 2019-07-12
 */
public interface IRoleService extends IService<Role> {
	public Set<Role> getUserOkRoleList(Long userId);
	public boolean existsUserOk(Long userId);
}
