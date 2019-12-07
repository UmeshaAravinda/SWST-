package com.kln.swst.simplerest.model;

public class Student {
    private String Name;
    private String address;
    private int age;

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
