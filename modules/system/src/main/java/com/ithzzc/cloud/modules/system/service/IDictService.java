package com.ithzzc.cloud.modules.system.service;

import com.ithzzc.cloud.modules.system.entity.Dict;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Mht
 * @since 2019-07-12
 */
public interface IDictService extends IService<Dict> {

	Dict getByNameOk(String label);

}
