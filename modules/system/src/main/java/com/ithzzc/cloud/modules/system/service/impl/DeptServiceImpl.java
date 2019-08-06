package com.ithzzc.cloud.modules.system.service.impl;

import com.ithzzc.cloud.modules.system.entity.Dept;
import com.ithzzc.cloud.modules.system.mapper.DeptMapper;
import com.ithzzc.cloud.modules.system.service.IDeptService;
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
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

	@Override
	public Dept getByNameOk(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
