package com.mycompany.myjfx.dao;


import com.mycompany.myjfx.hibernate.HibernateUtil;
import com.mycompany.myjfx.model.IdentifierModel;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import java.util.List;

public interface GenericDAO<T extends IdentifierModel> {

    List<T> list();

    T read(Long id);

    T create(T t);

    T update(T t);

    void delete(T t);

}
