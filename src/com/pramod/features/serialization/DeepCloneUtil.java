package com.pramod.features.serialization;

import java.io.*;

public class DeepCloneUtil {
    public static <T extends Serializable> T deepClone(T object) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(object);
        out.close();

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream in = new ObjectInputStream(bis);
        in.close();
        return (T) in.readObject();
    }
}
