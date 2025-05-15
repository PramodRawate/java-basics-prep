package com.pramod.features.serialization;

import java.io.*;

class User implements Serializable{
    public String username;
    public transient String password;

    User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Username: " + username + ", Password: " + password;
    }

    @Serial
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.password = "Default12";
    }
}

public class JavaSerialization {

    public static void main(String[] args) throws Exception {
        User u1 = new User("Pramod", "test123");
        User u2 = DeepCloneUtil.deepClone(u1);

        u1.password = "test123Updated";

        System.out.println("User1: " + u1);
        System.out.println("User2: " + u2);
    }
}
