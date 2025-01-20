package com.pixel;

import com.pixel.model.Student;
import com.pixel.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class HibernatePostgreApp {
    public static void main( String[] args )    {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        /*String version = (String) session.createNativeQuery("select version()").getSingleResult();
        System.out.println(version);*/
        Transaction tx = session.beginTransaction();
        Student student = new Student();
        student.setId(1);
        student.setName("Tom");
        session.persist(student);
        tx.commit();
        session.close();
        System.out.println(student);
    }
}
