package com.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.test.demo.bean.User;
import com.test.demo.mapper.UserMapper;
import com.test.demo.model.Response;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	private Gson gson = new Gson();
	
	@Autowired
	private UserMapper userMapper;
	
	@GetMapping()
	public String getUserById(Integer id) {
		Response resp = null;
		if(StringUtils.isEmpty(id)) {
			return "id can not be null neither an empty string.";
		}
		User user = userMapper.getUserById(id);
		return gson.toJson(resp);
	}
	
}
