package com.ithzzc.cloud.modules.system.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ithzzc.cloud.modules.system.entity.Upload;
import com.ithzzc.cloud.modules.system.mapper.FileMapper;
import com.ithzzc.cloud.modules.system.service.IFileService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Mht
 * @since 2019-07-12
 */
@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, Upload> implements IFileService {

}
