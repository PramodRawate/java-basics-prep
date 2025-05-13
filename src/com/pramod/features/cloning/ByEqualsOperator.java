package com.pramod.features.cloning;

import java.sql.Array;
import java.util.ArrayList;

/**
 This example shows Java's object cloning using = operator.
 Here an existing object is copied and a new object is created using = operator.
 By since in Java classes/objects are pass by reference the = operator is assigning the reference of the object to new object.
 So change in any of the object's value will point to same object.
 **/
public class ByEqualsOperator {
    public static void main(String[] args) {
        ArrayList<String> p1MobileNumbers = new ArrayList<>();
        p1MobileNumbers.add("12345");
        p1MobileNumbers.add("67890");
        Person p1 = new Person("Pramod", 29, p1MobileNumbers);
        Person p2 = p1;
        p1.age = 40;

        p1.printPersonDetails();
        p2.printPersonDetails();

        ArrayList<String> p2MobileNumbers = new ArrayList<>();
        p2.age = 60;
        p2.mobileNumbers.add("11111");
        p2.mobileNumbers.add("22222");

        p1.printPersonDetails();
        p2.printPersonDetails();
    }
}
