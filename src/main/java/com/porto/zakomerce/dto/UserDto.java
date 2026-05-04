package com.porto.zakomerce.dto;

import com.porto.zakomerce.model.Cart;
import com.porto.zakomerce.model.Order;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private List<OrderDto> orders;
    private CartDto cart;
}
