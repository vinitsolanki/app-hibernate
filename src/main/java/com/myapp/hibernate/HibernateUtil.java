package com.myapp.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {

            Configuration configuration = new Configuration().configure();
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties());
            SessionFactory sessionFactory = configuration
                    .buildSessionFactory(builder.build());
            return sessionFactory.openSession();
        //return sessionFactory.openSession();
    }

    public static void shutdown() {
        sessionFactory.close();
    }

    public static void create(Object... objects ){

        Session session = getSession();
        Transaction tx = session.beginTransaction();

        try{
            for (Object object : objects) {
                session.save(object);
            }

            tx.commit();

        }finally {
            session.close();
            shutdown();
        }

    }
}