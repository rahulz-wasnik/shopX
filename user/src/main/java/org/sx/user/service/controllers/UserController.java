package org.sx.user.service.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.sx.dto.AddressDTO;
import org.sx.dto.ApiResponseDTO;
import org.sx.dto.UserDTO;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(name = "v1/users")
public class UserController {

    @PostMapping
    public ResponseEntity<ApiResponseDTO<UserDTO>> createUser(@RequestBody UserDTO userDTO) {
        ApiResponseDTO<UserDTO> apiResponseDTO = new ApiResponseDTO<>();
        return ResponseEntity.status(HttpStatus.CREATED).body(apiResponseDTO);
    }

    @GetMapping("/{userId}/addresses")
    public ResponseEntity<ApiResponseDTO<List<AddressDTO>>> getUserAddressesByUserId(String userId) {
        ApiResponseDTO<List<AddressDTO>> apiResponseDTO = new ApiResponseDTO<>();
        apiResponseDTO.setResponse(new ArrayList<>());
        return ResponseEntity.ok(apiResponseDTO);
    }
}
