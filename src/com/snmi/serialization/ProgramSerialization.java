package com.snmi.serialization;

/**
 * The program showing how to implement and use correctly Serialization
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramSerialization {

    /**
     * Constants
     */
    private static final String SERIALIZATION_FILE_NAME = "Serialization.txt";
    private static final String ANIMAL_SENTENCE = "%s is on %d age and he is awesome animal!";

    public static void main(String[] args) {
        Animal animal = new Animal("Sharo", 7);
        Serializer.serialize(animal, SERIALIZATION_FILE_NAME);

        Animal deserializeAnimal = deserializeAnimal();

        if (deserializeAnimal != null) {
            String name = deserializeAnimal.getName();
            int age = deserializeAnimal.getAge();
            System.out.printf(ANIMAL_SENTENCE, name, age);
        }
    }

    /**
     * Calling the deserialize method of Serializer to return the object from file
     * @return the deserialize animal
     */
    private static Animal deserializeAnimal() {
        Animal animal = null;
        try {
            Object object = Serializer.deserialize(SERIALIZATION_FILE_NAME);
            animal = (Animal) object;
        } catch(Exception e) {
            e.printStackTrace();
        }

        return animal;
    }

}
