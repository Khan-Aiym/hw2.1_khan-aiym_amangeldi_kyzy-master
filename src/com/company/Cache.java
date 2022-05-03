package com.company;

public class Cache {
    private int age;
    private String name;
    private Salesman salesman;

    public Cache (int age, String name, Salesman salesman) {
        this.age = age;
        this.name = name;
        this.salesman = salesman;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Salesman getSalesman() {
        return salesman;
    }
public String getInfo() {
    return "Age: " + age + "\nName: " + name;
}}