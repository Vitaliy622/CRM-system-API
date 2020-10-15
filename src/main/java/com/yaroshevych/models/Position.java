package com.yaroshevych.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
@Entity
@Data
@NoArgsConstructor
public class Position {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    private String name;
    private BigDecimal price;
    private String description;
    private Boolean availability;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long categoryId;

    public Position(String name, BigDecimal price, String description, Boolean availability, long categoryId) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.availability = availability;
        this.categoryId = categoryId;
    }
}
