package com.mycompany.myjfx.service;


import com.mycompany.myjfx.dao.GenericDAO;
import com.mycompany.myjfx.dao.PeopleDAOImpl;
import com.mycompany.myjfx.model.People;


public class PeopleServiceImpl<T extends People>
        extends GenericServiceImpl<T>
        implements PeopleService<T> {

    @Override
    protected GenericDAO<T> getDAO() {
        return new PeopleDAOImpl<T>();
    }

}
