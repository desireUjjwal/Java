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

        Laptop l3 = new Laptop();
        l3.setLid(3);
        l3.setBrand("Apple");
        l3.setModel("Macbook");
        l3.setRam(8);

        Alien a1 = new Alien();
        a1.setAid(101);
        a1.setAname("Shiva");
        a1.setTech("SpringBoot");


        Alien a2 = new Alien();
        a2.setAid(102);
        a2.setAname("Harsh");
        a2.setTech("Python");


        a1.setLaptops(Arrays.asList(l1,l2));
        a2.setLaptops(Arrays.asList(l3));

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Alien.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(l1); // It needs to be persisted first because laptop is the primary table now
        session.persist(l2);
        session.persist(l3);

        session.persist(a1);
        session.persist(a2);

        transaction.commit();

        session.close();
        Session session1 = sf.openSession();
        Alien a5 = session1.get(Alien.class, 101); // this is not firing a select query because of default l1 cache provided by hibernate, we can do sharing of data between multiple sessions using some libraries - l2 caching(eh cache,caffine)
//        System.out.println(a5); // If we would not print a5 it will go for lazy fetching otherwise eager fetching (lazy fetching --> It will not fetch collection items like List<Laptop>)
        session1.close();
        sf.close();
    }
}
