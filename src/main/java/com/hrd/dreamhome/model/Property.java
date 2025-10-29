package com.hrd.dreamhome.model;

import jakarta.persistence.*;

@Entity
@Table(name = "property")
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private double price;
    private String address;

    private boolean rental; // true = location, false = vente

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;
}