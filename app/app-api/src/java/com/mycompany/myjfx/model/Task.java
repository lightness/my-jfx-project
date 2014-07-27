package com.mycompany.myjfx.model;

import javax.persistence.*;


@Entity
@Table(name = "TASK")
public class Task extends IdentifierModel {

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "people_id")
    private People people;

    @Enumerated(EnumType.STRING)
    @Column(name = "task_status")
    private TaskStatus taskStatus;


    public Task() {

    }

    public Task(String title, People people, TaskStatus taskStatus) {
        this.title = title;
        this.people = people;
        this.taskStatus = taskStatus;
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