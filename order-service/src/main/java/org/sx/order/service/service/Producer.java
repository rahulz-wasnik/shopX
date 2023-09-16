package org.sx.order.service.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.sx.constants.AppTopics;

@Service
public class Producer {

    private static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void createOrder(String message) {
        LOGGER.info(String.format("Create order message %s", message));
        kafkaTemplate.send(AppTopics.ORDER, message);
    }
}
