package com.apple.kafka.kafkaconsumer.Listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListner {
	
	@KafkaListener(topics="myTopicAnkit", groupId="group_id")
	public void consume(String message) {
		System.out.println("Message is :------- "+message);
	}

	
}
