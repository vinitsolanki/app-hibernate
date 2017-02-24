package com.myapp.hibernate.inheritance;

import javax.persistence.*;

@Entity
@Table(name = "VEHICLE")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) //Least normalisation strategy
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) //slightly more normalized1
//@Inheritance(strategy=InheritanceType.JOINED)//Highly normalized
public class Vehicle {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) // for SINGLE_TABLE or JOINED
    //@GeneratedValue(strategy=GenerationType.TABLE) // for TABLE_PER_CLASS : If you got this error "Cannot use identity column key generation with <union-subclass> mapping" then uncomment this line
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}