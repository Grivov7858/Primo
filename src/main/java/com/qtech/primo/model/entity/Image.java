package com.qtech.primo.model.entity;

import javax.persistence.*;

@Entity(name = "image")
public class Image {

    private long id;
    //TODO add fields for actual images
    private Order order;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    @ManyToOne(targetEntity = Order.class)
    @JoinColumn(name = "order", referencedColumnName = "id")
    public Order getOrder() {
        return order;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
