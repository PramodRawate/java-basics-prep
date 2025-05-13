package com.pramod.features.cloning;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    public String name;
    public int age;
    public ArrayList<String> mobileNumbers;
//    public String[] mobileNumbers;

    Person(String name, int age, ArrayList<String> mobileNumbers) {
        this.name = name;
        this.age = age;
        this.mobileNumbers = mobileNumbers;
    }

    // Below constructor is copy constructor the usage of which is demonstrated in ByCopyConstructor.java
    Person(Person anotherPerson) {
        this.name = anotherPerson.name;
        this.age = anotherPerson.age;

        /*
        Below is shallow copy
         */
        this.mobileNumbers = anotherPerson.mobileNumbers;

        /*
        Below is Deep copy
         */
        this.mobileNumbers = new ArrayList<String>(anotherPerson.mobileNumbers);
    }

    public void printPersonDetails() {
        System.out.println("Name: "+this.name+" | Age: "+this.age+" | Mobile Numebers: "+ mobileNumbers);
    }
}