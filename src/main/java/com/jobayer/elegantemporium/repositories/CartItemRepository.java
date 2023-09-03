package com.jobayer.elegantemporium.repositories;

import com.jobayer.elegantemporium.models.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    // You can define custom query methods here if needed
}