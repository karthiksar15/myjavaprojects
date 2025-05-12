package com.home.rabbimq_consumer.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitmqConsumerConfig {

    public static final String QUEUE_NAME = "rabbitmq-sb";

    @Bean
    public Queue testQueue() {
        return new Queue(QUEUE_NAME, false);
    }

    @RabbitListener(queues = QUEUE_NAME)
    public void listener(String message) {
        System.out.println("Received message is --" + message);
    }
}
