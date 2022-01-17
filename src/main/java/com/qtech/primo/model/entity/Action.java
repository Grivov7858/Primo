package com.qtech.primo.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity(name = "action")
public class Action {

    private long id;
    private String name;
    private Integer expectedMinutesToComplete;
    private List<ActionStatus> actionStatuses;
    private Product product;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    @Column(name = "expected_min_to_complete")
    public Integer getExpectedMinutesToComplete() {
        return expectedMinutesToComplete;
    }

    @OneToMany(targetEntity = ActionStatus.class, mappedBy = "action")
    public List<ActionStatus> getActionPerforms() {
        return actionStatuses;
    }

    @ManyToOne(targetEntity = Product.class)
    @JoinColumn(name = "product", referencedColumnName = "id")
    public Product getProduct() {
        return product;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExpectedMinutesToComplete(Integer expectedMinutesToComplete) {
        this.expectedMinutesToComplete = expectedMinutesToComplete;
    }

    public void setActionPerforms(List<ActionStatus> actionStatuses) {
        this.actionStatuses = actionStatuses;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
