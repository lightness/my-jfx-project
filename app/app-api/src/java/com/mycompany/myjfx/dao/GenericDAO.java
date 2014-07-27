package com.mycompany.myjfx.dao;


import com.mycompany.myjfx.model.IdentifierModel;

import java.util.List;

public interface GenericDAO<T extends IdentifierModel> {

    List<T> list();

    T read(Long id);

    T create(T t);

    T update(T t);

    void delete(T t);

}
