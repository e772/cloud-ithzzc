package com.ithzzc.cloud.modules.system.service.impl;

import com.ithzzc.cloud.modules.system.entity.ActionLog;
import com.ithzzc.cloud.modules.system.mapper.ActionLogMapper;
import com.ithzzc.cloud.modules.system.service.IActionLogService;
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
public class ActionLogServiceImpl extends ServiceImpl<ActionLogMapper, ActionLog> implements IActionLogService {

	@Override
	public List<ActionLog> getDataLogList(String tableName, Long entityId) {
		// TODO Auto-generated method stub
		return null;
	}

}
