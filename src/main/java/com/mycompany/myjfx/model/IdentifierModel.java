package com.mycompany.myjfx.model;


import javax.persistence.*;


@MappedSuperclass
public class IdentifierModel {

    @Id
    @GeneratedValue
    private Long id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
