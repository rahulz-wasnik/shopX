package org.sx.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "INVENTORY")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK_SEQ_INVENTORY_ID")
    @SequenceGenerator(name = "PK_SEQ_INVENTORY_ID", sequenceName = "PK_SEQ_INVENTORY_ID", allocationSize = 1, initialValue = 1)
    long id;

    @Column(name = "PRODUCT_ID")
    private String productId;

    @Column(name = "STOCK_QUANTITY")
    private long stockQuantity;

}
