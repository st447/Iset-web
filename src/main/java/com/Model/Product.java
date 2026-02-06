package com.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private String category;
    private String power;
    private double price;

    // Constructors
    public Product() {}
    public Product(String name, String description, String category, String power, double price) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.power = power;
        this.price = price;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public String getPower() { return power; }
    public void setPower(String power) { this.power = power; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public void setId(Long id) {
        this.id = id;
    }
}
