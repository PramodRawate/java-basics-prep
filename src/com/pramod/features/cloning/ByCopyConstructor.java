package com.pramod.features.cloning;

public class ByCopyConstructor {
    public static void main(String[] args) {
        Person p1 = new Person("Pramod", 29);
        Person p2 = new Person(p1);

        p1.printPerson();
        p2.printPerson();

        p1.name = "Pramod Rawate";
        p1.age = 40;

        p1.printPerson();
        p2.printPerson();

    }
}
