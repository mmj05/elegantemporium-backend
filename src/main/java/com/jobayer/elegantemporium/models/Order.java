package com.jobayer.elegantemporium.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;

    @Column(name = "order_date")
    private java.sql.Timestamp orderDate;

    @Column(name = "total_price")
    private double totalPrice;

    @Column(name = "shipping_address")
    private String shippingAddress;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "order_status")
    private String orderStatus;

    // Constructors, getters, and setters

    // Constructors
    public Order() {
        // Default constructor
    }

    public Order(User user, java.sql.Timestamp orderDate, double totalPrice, String shippingAddress, String paymentMethod, String orderStatus) {
        this.user = user;
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;
        this.shippingAddress = shippingAddress;
        this.paymentMethod = paymentMethod;
        this.orderStatus = orderStatus;
    }

    // Getters and setters for all fields

    // Other methods and custom business logic can be added here
}
