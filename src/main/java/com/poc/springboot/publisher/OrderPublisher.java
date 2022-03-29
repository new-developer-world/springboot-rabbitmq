package com.poc.springboot.publisher;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.springboot.configuration.MessageConfiguration;
import com.poc.springboot.entity.Order;
import com.poc.springboot.entity.OrderStatus;

@RestController
@RequestMapping("/order")
public class OrderPublisher {

	@Autowired
	private RabbitTemplate template;
	@PostMapping("/{restaurant}")
	public String bookOrder(@RequestBody Order order,@PathVariable String restaurant) {
		order.setOrderId(UUID.randomUUID().toString());
		
		OrderStatus orderStatus=new OrderStatus(order,"Process","Order placed successfully in "+ restaurant );
		template.convertAndSend(MessageConfiguration.EXCHANGE, MessageConfiguration.ROUTING_KEY, orderStatus);
		
		return "Success!";
	}
}
