package com.qtech.primo.model.entity;

import com.qtech.primo.model.Priority;

import javax.persistence.*;
import java.util.List;

@Entity(name = "order")
public class Order {

    private long id;
    private Product product;
    private Priority priority;
    private List<ActionStatus> actions;
    private List<Image> images;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    @ManyToOne(targetEntity = Product.class)
    @JoinColumn(name = "product", referencedColumnName = "id")
    public Product getProduct() {
        return product;
    }

    @Column(name = "priority")
    public Priority getPriority() {
        return priority;
    }

    @OneToMany(targetEntity = ActionStatus.class, mappedBy = "order")
    public List<ActionStatus> getActions() {
        return actions;
    }

    @OneToMany(targetEntity = Image.class, mappedBy = "order")
    public List<Image> getImages() {
        return images;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setActions(List<ActionStatus> actions) {
        this.actions = actions;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}
