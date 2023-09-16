package org.sx.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDTO {

    private Long id;
    private String name;
    private String category;
    private BigDecimal price;
    private Long quantityOrdered;
}
