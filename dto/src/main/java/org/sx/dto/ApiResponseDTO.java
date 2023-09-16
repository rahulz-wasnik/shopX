package org.sx.dto;

import lombok.Data;

@Data
public class ApiResponseDTO<T> {
    T response;
}
