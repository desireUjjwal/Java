package org.example;

import jakarta.persistence.*;

//@Entity(name="alien_table")
@Entity
public class Alien {
    @Id
    private  int aid;
    private String aname;
    private String tech;
    @OneToOne
    private Laptop Laptop;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public Laptop getLaptop() {
        return Laptop;
    }

    public void setLaptop(Laptop laptop) {
        Laptop = laptop;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", Laptop=" + Laptop +
                '}';
    }
}
