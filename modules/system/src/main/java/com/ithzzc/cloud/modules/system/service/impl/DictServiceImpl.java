package com.ithzzc.cloud.modules.system.service.impl;

import com.ithzzc.cloud.modules.system.entity.Dict;
import com.ithzzc.cloud.modules.system.mapper.DictMapper;
import com.ithzzc.cloud.modules.system.service.IDictService;
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
public class DictServiceImpl extends ServiceImpl<DictMapper, Dict> implements IDictService {

	@Override
	public Dict getByNameOk(String label) {
		// TODO Auto-generated method stub
		return null;
	}

}
