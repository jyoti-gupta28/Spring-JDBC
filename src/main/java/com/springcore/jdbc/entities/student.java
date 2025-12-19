package com.springcore.jdbc;

public class student {
    private int id;
    private String name;
    private String city;

    @Override
    public String toString() {
        return "student{" +
                "city='" + city + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

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

    public student(String city, int id, String name) {
        this.city = city;
        this.id = id;
        this.name = name;
    }

    public student() {
    }
}
