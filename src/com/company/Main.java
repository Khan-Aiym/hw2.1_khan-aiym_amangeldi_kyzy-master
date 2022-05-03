
package com.company;

public class Main {

    public static void main(String[] args) {
        Buyer objectA = new Buyer(28, "Sasha", Salesman.JEANS, Gender.MAN, "brown");
        Cache objectB = new Cache(32, "Jenya", Salesman.PANTS);
        Cache objectC = new Cache(37, "Andrey", Salesman.SHIRT);
        System.out.println(objectA.getInfo());
        System.out.println(objectA.getHair());
        objectA.magaz();
        System.out.println("================");
        System.out.println(objectB.getInfo());
        System.out.println("================");
        System.out.println(objectC.getInfo());
        System.out.println("================");
    }
}