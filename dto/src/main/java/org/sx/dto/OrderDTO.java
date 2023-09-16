package org.sx.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class OrderDTO {
    private Long id;
    @NotBlank
    private String username;
    @NotEmpty
    private List<ProductDTO> orderedProducts;
}
