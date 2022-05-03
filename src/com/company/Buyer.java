package com.company;

public class Buyer extends Cache {
    private Gender gender;
    private String hair;

    public Buyer (int age, String name, Salesman salesman, Gender gender, String hair) {
        super(age, name, salesman);
        this.gender = gender;
        this.hair = hair;
    }

    public Gender getGender() {
        return gender;
    }

    public String getHair() {
        return "Hair " + hair;
    }

    public void magaz() {
        System.out.println()("Goes to the market: " + getName());
    }

    public void magaz(int call) {
        call = 13;
        System.out.println("Идет в магазин: " + getName() + " " + call + " лет");
    }

    public String getInfo() {
        return "\nGender: " + gender;
    }
}
