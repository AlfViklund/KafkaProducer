package com.arslek.KafkaProducer.producer;

import com.arslek.KafkaProducer.model.Test;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TopicProducer {

    @Value("${topic.name.producer}")
    private String topicName;

    private final KafkaTemplate<String, Test> kafkaTemplate;

    public void send(Test message) {
        log.info("Message: {} ", message);
        kafkaTemplate.send(topicName, message);
    }
}
