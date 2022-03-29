package com.poc.springboot.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.poc.springboot.configuration.MessageConfiguration;
import com.poc.springboot.entity.OrderStatus;

@Component
public class User {

	@RabbitListener(queues = MessageConfiguration.QUEUE)
	public void consumerMessageFromQueue(OrderStatus orderStatus) {
		System.out.println("Message Recieved :" + orderStatus);
	}
}
