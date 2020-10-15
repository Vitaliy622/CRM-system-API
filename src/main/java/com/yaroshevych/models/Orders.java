package com.yaroshevych.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;

    private Date date;
    private long orderNumber;
    private OrderItem orderItem;
    private BigDecimal orderPrice;

    public Orders(long userId, Date date, long orderNumber, OrderItem orderItem, BigDecimal orderPrice) {
        this.userId = userId;
        this.date = date;
        this.orderNumber = orderNumber;
        this.orderItem = orderItem;
        this.orderPrice = orderPrice;
    }
}