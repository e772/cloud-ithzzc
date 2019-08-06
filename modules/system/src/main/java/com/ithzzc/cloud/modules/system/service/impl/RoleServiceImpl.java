package com.ithzzc.cloud.modules.system.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ithzzc.cloud.modules.system.entity.Role;
import com.ithzzc.cloud.modules.system.entity.UserRole;
import com.ithzzc.cloud.modules.system.mapper.RoleMapper;
import com.ithzzc.cloud.modules.system.service.IRoleService;
import com.ithzzc.cloud.modules.system.service.IUserRoleService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Mht
 * @since 2019-07-12
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

	@Autowired
	private IUserRoleService userRoleService;
	
	@Override
	public Set<Role> getUserOkRoleList(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsUserOk(Long userId) {
		
		EntityWrapper<UserRole> wrapper = new EntityWrapper<>();
		wrapper.eq("user_id", userId);
		wrapper.eq("role_id", 1L);
		List<UserRole> list = userRoleService.selectList(wrapper);
		return  !list.isEmpty();
	}

}
