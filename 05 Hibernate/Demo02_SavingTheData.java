package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo02_SavingTheData {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setsName("Avni");
        s1.setRollNo(6);
        s1.setsAge(25);

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(org.example.Student.class);
//        cfg.configure();
//        SessionFactory sf = cfg.buildSessionFactory();
        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Student.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(s1);
        transaction.commit();
        session.close();
        sf.close();
    }
}
