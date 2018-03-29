package com.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.service.BaseService;

@RestController
@RequestMapping("/v1")
public class BaseController {

	@Autowired
	private BaseService bs;
	
	@GetMapping("test")
	public String getMethod(@RequestParam String param) {
		String result = bs.getValue(param) ;
		if(StringUtils.isEmpty(param)) {
			result = "empty";
		}
		return result;
	}

}
