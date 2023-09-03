package com.jobayer.elegantemporium.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "cart")
    private List<CartItem> cartItems;

    @Column(name = "created_at")
    private java.sql.Timestamp createdAt;

    // Constructors, getters, and setters

    // Constructors
    public Cart() {
        // Default constructor
    }

    public Cart(User user, java.sql.Timestamp createdAt) {
        this.user = user;
        this.createdAt = createdAt;
    }

    // Getters and setters for all fields

    // Other methods and custom business logic can be added here
}
