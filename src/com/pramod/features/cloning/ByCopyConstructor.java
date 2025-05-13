package com.pramod.features.cloning;

import java.util.ArrayList;

public class ByCopyConstructor {
    public static void main(String[] args) {
        ArrayList<String> p1MobileNumbers = new ArrayList<>();
        p1MobileNumbers.add("12345");
        p1MobileNumbers.add("67890");
        Person p1 = new Person("Pramod", 29, p1MobileNumbers);
        Person p2 = new Person(p1);

        p1.printPersonDetails();
        p2.printPersonDetails();

        p1.name = "Pramod Rawate";
        p1.age = 40;
        p1.mobileNumbers.add("09876");

        p1.printPersonDetails();
        p2.printPersonDetails();

    }
}
