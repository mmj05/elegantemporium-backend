package com.jobayer.elegantemporium.models;

import jakarta.persistence.*;

@Entity
@Table(name = "order_items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(nullable = false)
    private int quantity;

    @Column(name = "item_price")
    private double itemPrice;

    // Constructors, getters, and setters

    // Constructors
    public OrderItem() {
        // Default constructor
    }

    public OrderItem(Order order, Product product, int quantity, double itemPrice) {
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    // Getters and setters for all fields

    // Other methods and custom business logic can be added here
}
