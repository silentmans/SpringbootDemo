package com.test.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.rabbitmq.Sender;

@RestController
@RequestMapping("/rabbitmq")
public class RabbitmqController {

	private static Logger logger = LogManager.getLogger(RabbitmqController.class);
	
	@Autowired
	private Sender sender;

	@PostMapping("/hello")
	public String hello() {
		logger.info("/rabbitmq/hello is working");
		sender.send();
		return "success";
	}

}
