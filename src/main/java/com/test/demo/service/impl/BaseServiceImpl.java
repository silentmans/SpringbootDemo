package com.test.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.test.demo.service.BaseService;

@Service
public class BaseServiceImpl implements BaseService {

	@Autowired
	private Environment env;
	
	@Override
	public String getValue(String key) {
		System.out.println("the key is : " + key);
		System.out.println("the value got from config by the key is : " + env.getProperty(key));
		return env.getProperty(key);
	}

}
