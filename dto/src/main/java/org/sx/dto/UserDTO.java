package org.sx.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class UserDTO {

    @NotNull
    @NotBlank
    private String userName;
    @NotEmpty
    private List<AddressDTO> addresses;
}
