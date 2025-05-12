package com.home.consumer_service.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListenerService {

    @KafkaListener(topics = "exampleTopic", groupId = "group_id")
    public void listen(String message) {
        System.out.println("received message---" + message);
    }
}
