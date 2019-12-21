package com.kln.swst.simplerest.model;

import javax.persistence.*;

@Entity
@Table(name = "swst_student")
public class Student {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column
    private long id;

    @Column
    private String Name;

    @Column
    private String address;

    @Column
    private int age;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age>100 || age<=0){
            throw new IllegalArgumentException("Invalid Age");
        }
        this.age = age;
    }
}
