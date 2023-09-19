package org.sx.order.service.entity;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@Table(name = "ORDERS")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK_SEQ_ORDERS_ID")
    @SequenceGenerator(name = "PK_SEQ_ORDERS_ID" ,sequenceName = "PK_SEQ_ORDERS_ID", allocationSize = 1, initialValue = 1)
    private Long id;

    @Column(name = "ORDER_BY", nullable = false)
    private String userId;

    @Column(name = "ORDER_DATE")
    private Timestamp orderDate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ORDER_ID", referencedColumnName = "id")
    private List<OrderedProduct> orderedProducts;

}
