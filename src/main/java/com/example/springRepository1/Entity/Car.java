package com.example.springRepository1.Entity;

import jakarta.persistence.*;

@Table
@Entity(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String modelMane;

    @Column(nullable = false)
    private Integer serialNumber;

    @Column
    private Double currentPrice;

    public Car(Long id, String modelMane, Integer serialNumber, Double currentPrice) {
        this.id = id;
        this.modelMane = modelMane;
        this.serialNumber = serialNumber;
        this.currentPrice = currentPrice;
    }

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelMane() {
        return modelMane;
    }

    public void setModelMane(String modelMane) {
        this.modelMane = modelMane;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }
}
