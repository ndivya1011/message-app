package com.message.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageCosumer {
	
    @JmsListener(destination = "standalone.queue")
    public void consume(String message) {
        System.out.println("Received Message: " + message);
    }

}
