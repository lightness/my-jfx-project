package com.mycompany.myjfx.service;


import com.mycompany.myjfx.dao.GenericDAO;
import com.mycompany.myjfx.dao.LogEntryDAOImpl;
import com.mycompany.myjfx.model.LogEntry;


public class LogEntryServiceImpl<T extends LogEntry>
        extends GenericServiceImpl<T>
        implements LogEntryService<T> {

    @Override
    protected GenericDAO<T> getDAO() {
        return new LogEntryDAOImpl<T>();
    }

}
