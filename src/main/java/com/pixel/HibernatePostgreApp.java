package com.pixel;

import com.pixel.model.Student;
import com.pixel.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class HibernatePostgreApp {
    public static void main( String[] args )    {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        String version = (String) session.createNativeQuery("select version()").getSingleResult();
        System.out.println(version);

        Student student = new Student(1, "Tom");
        System.out.println(student);
    }
}
