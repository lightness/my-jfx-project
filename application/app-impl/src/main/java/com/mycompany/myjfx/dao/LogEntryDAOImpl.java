package com.mycompany.myjfx.dao;

import com.mycompany.myjfx.model.LogEntry;
import com.mycompany.myjfx.model.Task;


public class LogEntryDAOImpl<T extends LogEntry>
        extends GenericDAOImpl<T>
        implements LogEntryDAO<T>

{

    protected Class getClazz() {
        return Task.class;
    }

}
