package org.sx.inventory.service.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "INVENTORY", uniqueConstraints = @UniqueConstraint(columnNames = {"PRODUCT_NAME"}, name = "UNQ_PRODUCTS_PRODUCT_NAME"))
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK_SEQ_INVENTORY_ID")
    @SequenceGenerator(name = "PK_SEQ_INVENTORY_ID", sequenceName = "PK_SEQ_INVENTORY_ID", allocationSize = 1, initialValue = 1)
    private Long id;

    @Column(name = "PRODUCT_NAME", nullable = false)
    private String productName;

    @Column(name = "PRODUCT_CATEGORY", nullable = false)
    private String productCategory;

    @Column(name = "PRICE", nullable = false)
    private BigDecimal price;

    @Column(name = "STOCK_QUANTITY", nullable = false)
    private long stockQuantity;

}
