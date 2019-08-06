package com.ithzzc.cloud.modules.system.service;

import com.ithzzc.cloud.modules.system.entity.ActionLog;

import java.util.List;

import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Mht
 * @since 2019-07-12
 */
public interface IActionLogService extends IService<ActionLog> {
	List<ActionLog> getDataLogList(String tableName, Long entityId);
}
