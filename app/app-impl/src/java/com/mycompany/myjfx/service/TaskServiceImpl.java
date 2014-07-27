package com.mycompany.myjfx.service;


import com.mycompany.myjfx.dao.GenericDAO;
import com.mycompany.myjfx.dao.TaskDAOImpl;
import com.mycompany.myjfx.model.Task;


public class TaskServiceImpl<T extends Task>
        extends GenericServiceImpl<T>
        implements TaskService<T> {

    @Override
    protected GenericDAO<T> getDAO() {
        return new TaskDAOImpl<T>();
    }

}
