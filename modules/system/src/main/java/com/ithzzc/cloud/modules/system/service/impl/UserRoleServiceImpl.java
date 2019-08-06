package com.ithzzc.cloud.modules.system.service.impl;

import com.ithzzc.cloud.modules.system.entity.UserRole;
import com.ithzzc.cloud.modules.system.mapper.UserRoleMapper;
import com.ithzzc.cloud.modules.system.service.IUserRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
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
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

	@Override
	public boolean existsUserOk(Long userId) {
		// TODO Auto-generated method stub
		return false;
	}

}
