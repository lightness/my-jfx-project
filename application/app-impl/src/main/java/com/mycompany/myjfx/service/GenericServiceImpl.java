package com.mycompany.myjfx.service;


import com.mycompany.myjfx.dao.GenericDAO;
import com.mycompany.myjfx.model.IdentifierModel;

import java.util.List;

public abstract class GenericServiceImpl<T extends IdentifierModel>
        implements GenericService<T> {

    @Override
    @SuppressWarnings("unchecked")
    public List<T> findAll() {
        GenericDAO<T> dao = this.getDAO();
        return dao.list();
    }

    @Override
    @SuppressWarnings("unchecked")
    public T findById(Long id) {
        GenericDAO<T> dao = this.getDAO();
        return dao.read(id);
    }

    @Override
    public T create(T t) {
        GenericDAO<T> dao = this.getDAO();
        return dao.create(t);
    }

    @Override
    public T update(T t) {
        GenericDAO<T> dao = this.getDAO();
        return dao.update(t);
    }

    @Override
    public void delete(T t) {
        GenericDAO<T> dao = this.getDAO();
        dao.delete(t);
    }

    protected abstract GenericDAO<T> getDAO();
}
