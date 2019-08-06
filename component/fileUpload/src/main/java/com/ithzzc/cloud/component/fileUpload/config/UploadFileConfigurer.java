package com.ithzzc.cloud.component.fileUpload.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.ithzzc.cloud.common.utils.SpringContextUtil;
import com.ithzzc.cloud.component.fileUpload.FileUpload;
import com.ithzzc.cloud.component.fileUpload.config.properties.UploadProjectProperties;

/**
 * @author 小懒虫
 * @date 2018/11/3
 */
@Configuration
public class UploadFileConfigurer implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        UploadProjectProperties properties = SpringContextUtil.getBean(UploadProjectProperties.class);
        registry.addResourceHandler(properties.getStaticPath()).addResourceLocations("file:" + FileUpload.getUploadPath());
    }
}
