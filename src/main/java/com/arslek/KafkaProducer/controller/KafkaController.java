package com.arslek.KafkaProducer.controller;

import com.arslek.KafkaProducer.model.Test;
import com.arslek.KafkaProducer.producer.TopicProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/kafka")
public class KafkaController {

    //private final KafkaTemplate<String, Test> producer;
    private final TopicProducer topicProducer;

    private final String TOPIC = "topico.teste";

    @GetMapping("/send")
    public void send() {
        //producer.send(TOPIC, new Test("testName", 30));
        topicProducer.send(new Test("testName", 30));
    }
}
