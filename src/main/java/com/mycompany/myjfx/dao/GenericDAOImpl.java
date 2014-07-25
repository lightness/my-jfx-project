package com.mycompany.myjfx.dao;


import com.mycompany.myjfx.hibernate.HibernateUtil;
import com.mycompany.myjfx.model.IdentifierModel;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import java.util.List;

public abstract class GenericDAOImpl<T extends IdentifierModel> {

    @SuppressWarnings("unchecked")
    public List<T> list() {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        List<T> list = session.createCriteria(this.getClazz()).list();
        session.close();
        return list;
    }

    @SuppressWarnings("unchecked")
    public T read(Long id) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        T t = (T) session.get(this.getClazz(), id);
        session.close();
        return t;
    }

    public T create(T t) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        Long id = (Long) session.save(t);
        t.setId(id);
        session.getTransaction().commit();
        session.close();
        return t;
    }

    public T update(T t) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        session.merge(t);
        session.getTransaction().commit();
        session.close();
        return t;
    }

    public void delete(T t) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        session.delete(t);
        session.getTransaction().commit();
        session.close();
    }

    protected abstract Class getClazz();
}
