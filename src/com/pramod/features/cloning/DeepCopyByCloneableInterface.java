package com.pramod.features.cloning;
class DeepAddress implements Cloneable {
    public String city;

    DeepAddress(String city) {
        this.city = city;
    }

    @Override
    public DeepAddress clone() throws CloneNotSupportedException {
        return (DeepAddress) super.clone();
    }

    @Override
    public String toString() {
        return "city: "+this.city;
    }
}

class DeepStudent implements Cloneable {
    public String name;
    public DeepAddress address;

    DeepStudent(String name, DeepAddress address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public DeepStudent clone() throws CloneNotSupportedException {
        DeepStudent cloned = (DeepStudent) super.clone();
        cloned.address = (DeepAddress) address.clone();
        return  cloned;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address:" + address +
                '}';
    }
}

public class DeepCopyByCloneableInterface {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepAddress student1Address = new DeepAddress("Pune");
        DeepStudent student1 = new DeepStudent("Pramod", student1Address);

        DeepStudent student2 = (DeepStudent) student1.clone();
        student1.address.city = "Mumbai";
        System.out.println(student1);
        System.out.println(student2);
    }


}
