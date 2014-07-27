package com.mycompany.myjfx.model;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "LOG_ENTRY")
public class LogEntry extends IdentifierModel {

    @Column(name = "date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    @Enumerated(EnumType.STRING)
    @Column(name = "task_status")
    private TaskStatus taskStatus;


    public LogEntry() {

    }

    public LogEntry(Task task, Date date, TaskStatus taskStatus) {
        this.task = task;
        this.date = date;
        this.taskStatus = taskStatus;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }
}