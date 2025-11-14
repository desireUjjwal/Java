package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Demo03_FetchingTheData {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setsName("Avni");
        s1.setRollNo(6);
        s1.setsAge(25);

        Student s2 = null;

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Student.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();
        s2 = session.get(Student.class, 1);
        // s2 = session.find(Student.class, 1);
        session.close();
        sf.close();
        System.out.println(s2);
    }
}
