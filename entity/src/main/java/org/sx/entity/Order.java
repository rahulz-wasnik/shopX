package org.sx.entity;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "ORDERS")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK_SEQ_ORDERS_ID")
    @SequenceGenerator(name = "PK_SEQ_ORDERS_ID" ,sequenceName = "PK_SEQ_ORDERS_ID", allocationSize = 1, initialValue = 1)
    long id;

    @Column(name = "ORDER_BY")
    private String userId;

    @Column(name = "ORDER_DATE")
    private Timestamp orderDate;

}
