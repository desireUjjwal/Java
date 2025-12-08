package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Embeddable {
    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setBrand("Lenovo");
        l1.setModel("Legion");
        l1.setRam(8);

        Alien a1 = new Alien();
        a1.setAid(102);
        a1.setAname("Shiva");
        a1.setTech("SpringBoot");
        a1.setLaptop(l1);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(org.example.Alien.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(a1);

        transaction.commit();
        Alien a2 = session.get(Alien.class, 102);
        System.out.println(a2);

        session.close();
        sf.close();
    }
}
