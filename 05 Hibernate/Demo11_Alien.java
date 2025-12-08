package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import java.util.List;


//@Entity(name="alien_table")
@Entity
public class Alien {
    @Id
    private  int aid;
    private String aname;
    private String tech;
    @ManyToMany
    private List<Laptop> Laptops;


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


    public List<Laptop> getLaptops() {
        return Laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        Laptops = laptops;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", tech='" + tech + '\'' +
                ", Laptops=" + Laptops +
                '}';
    }
}
