package com.ithzzc.cloud.admin.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.ithzzc.cloud.modules.system.entity.Dict;
import com.ithzzc.cloud.modules.system.service.IDictService;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Mht
 * @since 2019-07-12
 */
@RestController
@RequestMapping("/dict")
public class DictController {
	
	@Autowired
	private IDictService dictService;
	
	@GetMapping("index")
	public Object index() {
		
		EntityWrapper<Dict> wrapper = new EntityWrapper<>();
		wrapper.isNotNull("name");
		System.out.println(wrapper.getSqlSegment());
		List<Dict> list = dictService.selectList(wrapper);
		JSONObject obj = new JSONObject();
		obj.put("data", list);
		return obj;
	}
}
