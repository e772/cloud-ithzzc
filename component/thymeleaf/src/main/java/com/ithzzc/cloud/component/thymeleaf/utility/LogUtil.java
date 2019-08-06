package com.ithzzc.cloud.component.thymeleaf.utility;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.persistence.Table;

import com.ithzzc.cloud.common.utils.EntityBeanUtil;
import com.ithzzc.cloud.common.utils.SpringContextUtil;
import com.ithzzc.cloud.modules.system.entity.ActionLog;
import com.ithzzc.cloud.modules.system.service.IActionLogService;

/**
 * @author 小懒虫
 * @date 2018/10/16
 */
public class LogUtil {

    /**
     * 获取实体对象的日志
     * @param entity 实体对象
     */
    public List<ActionLog> entityList(Object entity){
        IActionLogService actionLogService = SpringContextUtil.getBean(IActionLogService.class);
        Table table = entity.getClass().getAnnotation(Table.class);
        String tableName = table.name();
        try {
            Object object = EntityBeanUtil.getField(entity, "id");
            Long entityId = Long.valueOf(String.valueOf(object));
            return actionLogService.getDataLogList(tableName, entityId);
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
