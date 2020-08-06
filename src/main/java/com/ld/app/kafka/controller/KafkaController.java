package com.ld.app.kafka.controller;

import com.ld.app.kafka.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {
	
	@Autowired
	private Producer producer;
	
	@PostMapping(value = "/publish")
	public void sendMessageToKafkaTopic(@RequestParam("message") String message){
		producer.sendMessage(message);
	}
}