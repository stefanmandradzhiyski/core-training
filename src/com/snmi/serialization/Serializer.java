package com.snmi.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Util Serializer
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Serializer {

    /**
     * Private constructor
     */
    private Serializer() {}

    /**
     * Serialize specific object to specific file
     * @param object take the object
     * @param fileName take the wanted file name
     */
    public static void serialize(Object object, String fileName) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))) {
            objectOutputStream.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Deserialize the serialize object from file
     * @param filename take the file name
     * @return the deserialize object
     */
    public static Object deserialize(String filename) {
        Object object = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(Paths.get(filename)))) {
            object = objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return object;
    }

}
