package com.porto.zakomerce.repository;

import com.porto.zakomerce.model.CartItem;
import com.porto.zakomerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    void deleteAllByCartId(Long id);
    List<CartItem> findByProductId(Long productId);
}
