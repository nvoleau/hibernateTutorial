package org.voleau.hibernate.exemple;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.voleau.hibernate.model.Person;
import org.voleau.hibernate.utils.HibernateUtils;

public class ExempleMain {


    public static void main(String[] args) {
        SessionFactory factory = HibernateUtils.getSessionFactory();

        Session session = factory.getCurrentSession();
        session.getTransaction().begin();

        Person p = new Person();
        p.setId(1);
        p.setNom("Voleau");
        p.setPrenom("Nicolas");
        session.save(p);

        session.getTransaction().commit();


    }

    }
