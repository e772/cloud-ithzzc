package com.ithzzc.cloud.admin.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "testapi")
public class TestApi {

	@ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
	@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
	@GetMapping(value = "index")
	public Object index() {

		JSONObject obj = new JSONObject();
		obj.put("success", true);
		obj.put("msg", "操作成功");
		obj.put("data", "");
		return obj;
	}

	@ApiOperation(value = "更新信息", notes = "根据url的id来指定更新用户信息")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long", paramType = "path"),
			@ApiImplicitParam(name = "user", value = "用户实体user", required = true, dataType = "User") })
	@GetMapping(value = "update")
	public Object update(Long id) {

		JSONObject obj = new JSONObject();
		obj.put("success", true);
		obj.put("msg", "操作成功");
		obj.put("data", "123");
		return obj;
	}
}
