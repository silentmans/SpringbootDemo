package com.test.demo.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.test.demo.constant.ResponseConstant;
import com.test.demo.entity.User;
import com.test.demo.mapper.UserMapper;
import com.test.demo.model.Response;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	private Logger logger = LogManager.getLogger(this.getClass());

	private Gson gson = new Gson();

	@Autowired
	private UserMapper userMapper;

	@GetMapping("test")
	public String getUserById(Integer id) {
		logger.info("/user/test id : " + id);
		Response resp = new Response();
		if (StringUtils.isEmpty(id)) {
			return "id can not be null neither an empty string.";
		}
		User user = userMapper.getUserById(id);
		resp.setData(user);
		resp.setStatus(ResponseConstant.SUCCESS);
		return gson.toJson(resp);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> login(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> map = new HashMap<String, Object>();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		if (!userName.equals("") && password != "") {
			User user = new User(userName, password);
			request.getSession().setAttribute("user", user);
			map.put("result", "1");
		} else {
			map.put("result", "0");
		}
		return map;
	}

}
