package com.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.service.IBaseService;
import com.test.demo.util.StringUtil;

@RestController
@RequestMapping("/test")
public class BaseController {

	@Autowired
	private IBaseService bs;
	
	@GetMapping()
	public String getMethod(@RequestParam String param) {
		String result = bs.getValue(param) ;
		if(StringUtil.isEmpty(param)) {
			result = "empty";
		}
		return result;
	}

}
