package com.example.demo.controller;

import com.example.demo.model.MessageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MessageController {

    Logger logger = LoggerFactory.getLogger(MessageController.class);

    @GetMapping("/message")
    public MessageResponse getMessage(){
        MessageResponse response = new MessageResponse();
        response.setMessage("message received from Backend API successfully.");
        return response;
    }

}
