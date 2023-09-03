package com.jobayer.elegantemporium.repositories;

import com.jobayer.elegantemporium.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    // You can define custom query methods here if needed
}
