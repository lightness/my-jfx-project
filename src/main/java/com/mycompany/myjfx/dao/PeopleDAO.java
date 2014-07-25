package com.mycompany.myjfx.dao;

import com.mycompany.myjfx.model.People;

import java.util.List;

public interface PeopleDAO<T extends People> {

    List<T> list();

    T read(Long id);

    T create(T t);

    T update(T t);

    void delete(T t);

}
