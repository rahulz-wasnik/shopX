package org.sx.order.service.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ORDERED_PRODUCTS")
public class OrderedProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK_SEQ_ORDERED_PRODUCTS_ID")
    @SequenceGenerator(name = "PK_SEQ_ORDERED_PRODUCTS_ID", sequenceName = "PK_SEQ_ORDERED_PRODUCTS_ID", allocationSize = 1, initialValue = 1)
    private Long id;

    @Column(name = "PRODUCT_ID")
    private String productId;

    @Column(name = "ORDER_QUANTITY")
    private Long quantityOrdered;

}
