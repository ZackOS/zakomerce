package com.porto.zakomerce.service.order;

import com.porto.zakomerce.dto.OrderDto;
import com.porto.zakomerce.model.Order;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}
