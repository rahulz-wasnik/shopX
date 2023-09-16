package org.sx.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "PRODUCTS",
        uniqueConstraints = @UniqueConstraint(columnNames = {"PRODUCT_NAME"}, name = "UNQ_PRODUCTS_PRODUCT_NAME")
    )
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK_SEQ_PRODUCTS_ID")
    @SequenceGenerator(name = "PK_SEQ_ORDERS_ID", sequenceName = "PK_SEQ_PRODUCTS_ID", allocationSize = 1, initialValue = 1)
    long id;

    @Column(name = "ORDER_ID")
    private String orderId;

    @Column(name = "PRODUCT_NAME")
    private String productName;

    @Column(name = "PRODUCT_CATEGORY")
    private String productCategory;

    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "ORDER_QUANTITY")
    private Long quantityOrdered;

}
