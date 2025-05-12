package com.home.rabbimq.controller;

import org.springframework.stereotype.Controller;

import com.home.rabbimq.service.MessageProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitmqController {
    private final MessageProducer messageProducer;

    public RabbitmqController(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    @GetMapping("/send")
    public String sendMessageSb(@RequestParam String message) {
        messageProducer.sendMessage(message);
        return "Message sent.." + message;
    }

}
