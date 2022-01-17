package com.qtech.primo.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "product")
public class Product {

    private long id;
    private String name;
    private String description;
    private List<Action> possibleActions;
    private List<Order> orders;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    @OneToMany(targetEntity = Action.class, mappedBy = "product")
    public List<Action> getPossibleActions() {
        return possibleActions;
    }

    @OneToMany(targetEntity = Order.class, mappedBy = "product")
    public List<Order> getOrders() {
        return orders;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPossibleActions(List<Action> possibleActions) {
        this.possibleActions = possibleActions;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
