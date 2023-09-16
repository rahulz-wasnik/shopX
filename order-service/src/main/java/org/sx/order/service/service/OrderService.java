package org.sx.order.service.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.sx.dto.OrderDTO;

@Service
public class OrderService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderService.class);

    @Autowired
    private Producer producer;

    @Autowired
    private ObjectMapper jacksonObjectMapper;

    public OrderDTO createOrder(OrderDTO orderDTO)  {
        try {
            producer.createOrder(jacksonObjectMapper.writeValueAsString(orderDTO));
        } catch (JsonProcessingException ex) {
            LOGGER.error(ex.getMessage());
        }

        return orderDTO;
    }
}
