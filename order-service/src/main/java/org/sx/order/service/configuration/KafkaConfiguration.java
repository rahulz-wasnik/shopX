package org.sx.order.service.configuration;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.sx.constants.AppTopics;

@Configuration
public class KafkaConfiguration {

    @Bean
    public NewTopic order() {
        return TopicBuilder.name(AppTopics.ORDER).build();
    }
}
