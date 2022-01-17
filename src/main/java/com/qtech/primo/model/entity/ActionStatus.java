package com.qtech.primo.model.entity;

import com.qtech.primo.model.TimeTakenStatus;
import com.qtech.primo.model.WorkingStatus;

import javax.persistence.*;

@Entity(name = "action_status")
public class ActionStatus {

    private long id;
    private Action action;
    private Integer actualMinutesToComplete;
    private WorkingStatus workingStatus;
    private TimeTakenStatus timeTakenStatus;
    private Order order;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    @ManyToOne(targetEntity = Action.class)
    @JoinColumn(name = "action", referencedColumnName = "id")
    public Action getAction() {
        return action;
    }

    @Column(name = "actual_minutes_to_complete")
    public Integer getActualMinutesToComplete() {
        return actualMinutesToComplete;
    }

    @Column(name = "working_status")
    public WorkingStatus getWorkingStatus() {
        return workingStatus;
    }

    @Column(name = "time_taken_status")
    public TimeTakenStatus getTimeTakenStatus() {
        return timeTakenStatus;
    }

    @ManyToOne(targetEntity = Order.class)
    @JoinColumn(name = "order", referencedColumnName = "id")
    public Order getOrder() {
        return order;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public void setActualMinutesToComplete(Integer actualMinutesToComplete) {
        this.actualMinutesToComplete = actualMinutesToComplete;
    }

    public void setWorkingStatus(WorkingStatus workingStatus) {
        this.workingStatus = workingStatus;
    }

    public void setTimeTakenStatus(TimeTakenStatus timeTakenStatus) {
        this.timeTakenStatus = timeTakenStatus;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
