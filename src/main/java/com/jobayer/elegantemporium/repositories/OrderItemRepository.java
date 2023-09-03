package com.jobayer.elegantemporium.repositories;

import com.jobayer.elegantemporium.models.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
    // You can define custom query methods here if needed
}