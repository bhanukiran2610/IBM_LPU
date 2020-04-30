package com.example.demo.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ItemsDAO;
import com.example.demo.model.Item;

@Service
public class RabbitMQConsumerService {
	
	private static final String QUEUE = "items-queue";
	private ItemsDAO dao;
	@Autowired
	public RabbitMQConsumerService(ItemsDAO dao) {
		super();
		this.dao = dao;
	}

	
	
	@RabbitListener(queues = QUEUE)
	public void receiveMessage(Item item) {

		System.out.println("Received Message from Items Queue >>" + item);
		dao.save(item);
		
	}
	
}
