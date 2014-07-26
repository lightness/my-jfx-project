package com.mycompany.myjfx.service;


import com.mycompany.myjfx.model.IdentifierModel;

import java.util.List;

public interface GenericService<T extends IdentifierModel> {

    List<T> findAll();

    T findById(Long id);

    T create(T people);

    T update(T people);

    void delete(T people);

}
