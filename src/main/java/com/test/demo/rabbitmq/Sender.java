package com.test.demo.rabbitmq;

import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {

	@Autowired
	private AmqpTemplate rabbitTemplate;

	public void send() {
		String sendMsg = "hello " + new Date();
		System.out.println("Sender : " + sendMsg);
		this.rabbitTemplate.convertAndSend("hello", sendMsg);
	}

}
