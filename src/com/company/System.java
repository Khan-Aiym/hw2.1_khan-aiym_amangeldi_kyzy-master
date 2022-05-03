package com.company;

public class System extends Buyer{
    private String color;

    public System (int age, String name, Salesman salesman, Gender gender, String chars, String color) {
        super(age, name, salesman, gender, chars);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
