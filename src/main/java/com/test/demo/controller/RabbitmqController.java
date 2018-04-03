package com.test.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.rabbitmq.Sender;

@RestController
@RequestMapping("/rabbitmq")
public class RabbitmqController {

	@Autowired
	private Sender sender;

	@PostMapping("/hello")
	public String hello() {
		sender.send();
		return "success";
	}

}
