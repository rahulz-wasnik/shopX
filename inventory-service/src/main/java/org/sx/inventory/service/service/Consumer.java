package org.sx.inventory.service.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.sx.constants.AppConsumerGroups;
import org.sx.constants.AppTopics;

@Service
public class Consumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = AppTopics.ORDER, groupId = AppConsumerGroups.ORDER_GROUP)
    public void consume(String message) {
        LOGGER.info(String.format("Checking inventory stock for order %s", message));
    }
}
