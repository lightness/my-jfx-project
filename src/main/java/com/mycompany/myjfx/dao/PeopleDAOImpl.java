package com.mycompany.myjfx.dao;

import com.mycompany.myjfx.model.People;


public class PeopleDAOImpl<T extends People>
        extends GenericDAOImpl<T>
        implements PeopleDAO<T>

{

    protected Class getClazz(){
        return People.class;
    }

}
