package org.sx.order.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.sx.order.service.entity.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}
