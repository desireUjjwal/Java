package org.example;

import jakarta.persistence.*;

//@Entity(name="alien_table")
@Entity
@Table(name = "alien_table")
public class Alien {
    @Id
    private  int aid;
    @Column(name="alien_name")
    private String aname;
    @Transient   // Using this we are preventing this column to get created in the database
    private String tech;

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
}
