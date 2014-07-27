package com.mycompany.myjfx.model;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "PEOPLE")
public class People extends IdentifierModel {


    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "people", cascade = {CascadeType.ALL})
    private List<Task> tasks;


    public People() {

    }

    public People(String login, String password) {
        this.login = login;
        this.password = password;

    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}