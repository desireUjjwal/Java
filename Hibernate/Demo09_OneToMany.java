package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setLid(1);
        l1.setBrand("Lenovo");
        l1.setModel("Legion");
        l1.setRam(8);

        Laptop l2 = new Laptop();
        l2.setLid(2);
        l2.setBrand("Dell");
        l2.setModel("XPS");
        l2.setRam(32);

        Alien a1 = new Alien();
        a1.setAid(102);
        a1.setAname("Shiva");
        a1.setTech("SpringBoot");
        a1.setLaptops(Arrays.asList(l1,l2));

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Alien.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(l1); // It needs to be persisted first because laptop is the primary table now
        session.persist(l2);
        session.persist(a1);

        transaction.commit();
        Alien a2 = session.get(Alien.class, 102); // why this is not firing a select query
        System.out.println(a2);

        session.close();
        sf.close();
    }
}
