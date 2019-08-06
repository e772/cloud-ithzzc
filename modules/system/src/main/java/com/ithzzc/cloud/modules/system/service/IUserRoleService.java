package com.ithzzc.cloud.modules.system.service;

import com.ithzzc.cloud.modules.system.entity.UserRole;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Mht
 * @since 2019-07-12
 */
public interface IUserRoleService extends IService<UserRole> {
 boolean existsUserOk(Long userId);
}
