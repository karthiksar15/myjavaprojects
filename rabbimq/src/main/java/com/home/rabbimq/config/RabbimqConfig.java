package com.home.rabbimq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class RabbimqConfig {

    public static final String QUEUE_NAME = "rabbitmq-sb";

    @Bean
    public Queue testQueue() {
        return new Queue(QUEUE_NAME, false);
    }

}
