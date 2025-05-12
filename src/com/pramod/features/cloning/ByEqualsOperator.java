package com.pramod.features.cloning;

class Person {
    public String name;
    public int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Below constructor is copy constructor the usage of which is demonstrated in ByCopyConstructor.java
    Person(Person anotherPerson) {
        this.name = anotherPerson.name;
        this.age = anotherPerson.age;
    }

    public void printPerson() {
        System.out.println("Name: "+this.name+" | Age: "+this.age);
    }
}

/**
 This example shows Java's object cloning using = operator.
 Here an existing object is copied and a new object is created using = operator.
 By since in Java classes/objects are pass by reference the = operator is assigning the reference of the object to new object.
 So change in any of the object's value will point to same object.
 **/
public class ByEqualsOperator {
    public static void main(String[] args) {
        Person p1 = new Person("Pramod", 29);
        Person p2 = p1;
        p1.age = 40;

        p1.printPerson();
        p2.printPerson();

        p2.age = 60;

        p1.printPerson();
        p2.printPerson();
    }
}
