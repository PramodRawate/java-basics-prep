package com.pramod.features.cloning;
class ShallowAddress implements Cloneable {
    public String city;

    ShallowAddress(String city) {
        this.city = city;
    }

    @Override
    public ShallowAddress clone() throws CloneNotSupportedException {
        return (ShallowAddress) super.clone();
    }

    @Override
    public String toString() {
        return "city: "+this.city;
    }
}

class ShallowStudent implements Cloneable {
    public String name;
    public ShallowAddress address;

    ShallowStudent(String name, ShallowAddress address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public ShallowStudent clone() throws CloneNotSupportedException {
        return  (ShallowStudent) super.clone();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address:" + address +
                '}';
    }
}

public class ShallowCopyByCloneableInterface {

    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowAddress student1Address = new ShallowAddress("Pune");
        ShallowStudent student1 = new ShallowStudent("Pramod", student1Address);

        ShallowStudent student2 = (ShallowStudent) student1.clone();
        student1.address.city = "Mumbai";
        System.out.println(student1);
        System.out.println(student2);
    }


}
