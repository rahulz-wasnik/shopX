package org.sx.user.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.sx.dto.AddressDTO;
import org.sx.dto.UserDTO;
import org.sx.entity.Address;
import org.sx.entity.User;
import org.sx.user.service.repository.UserRepository;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDTO createUser(UserDTO userDTO) {
        return mapToDTO(userRepository.save(mapToUserEnity(userDTO)));
    }

    private UserDTO mapToDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserName(user.getUserName());
        userDTO.setAddresses(user.getAddressList().stream().map(element -> mapToDTO(element)).toList());
        return userDTO;
    }

    private AddressDTO mapToDTO(Address address) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setAddressLine1(address.getAddressLineOne());
        addressDTO.setAddressLine2(address.getAddressLineTwo());
        addressDTO.setCity(address.getCity());
        addressDTO.setPinCode(address.getPinCode());
        return addressDTO;
    }

    private User mapToUserEnity(UserDTO userDTO) {
        User user = new User();
        user.setUserName(userDTO.getUserName());
        user.setAddressList(userDTO.getAddresses().stream().map(element -> mapToAddressEntity(element)).toList());
        return user;
    }

    private Address mapToAddressEntity(AddressDTO addressDTO) {
        Address address = new Address();
        address.setAddressLineOne(addressDTO.getAddressLine1());
        address.setAddressLineTwo(addressDTO.getAddressLine2());
        address.setCity(addressDTO.getCity());
        address.setPinCode(addressDTO.getPinCode());
        return address;
    }
}
