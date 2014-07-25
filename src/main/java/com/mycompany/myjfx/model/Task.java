package com.mycompany.myjfx.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="TASK")
public class Task extends IdentifierModel {

    @Column(name="title")
    private String title;

    @ManyToOne
    @JoinColumn(name="people_id")
    private People people;

    @Enumerated(EnumType.STRING)
    private TaskStatus taskStatus;


    public Task() {

    }

    public Task(String title, People people) {
        this.title = title;
        this.people = people;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }
}