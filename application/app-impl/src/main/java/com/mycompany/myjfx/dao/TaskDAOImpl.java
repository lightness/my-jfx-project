package com.mycompany.myjfx.dao;

import com.mycompany.myjfx.model.Task;


public class TaskDAOImpl<T extends Task>
        extends GenericDAOImpl<T>
        implements TaskDAO<T>

{

    protected Class getClazz() {
        return Task.class;
    }

}
