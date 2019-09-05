package com.snmi.optional;

import java.util.Optional;

/**
 * The program shows how to use Optional
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramOptional {

    /**
     * Constants
     */
    private static final String PRESENT_PERSON = "Person %s belongs to %s";

    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("bul. Nikola Vapcarov");
        address.setStreetNumber(25);
        address.setCity("Plovdiv");

        Person person = null;
        Optional<Person> optionalUser = Optional.ofNullable(person);
        optionalUser.ifPresent(System.out::println);

        Person userAdvance = optionalUser.orElse(new Person("StefanADVANCE", "MandradzhiyskiADVANCE", 24));
        System.out.println(userAdvance.getFirstName());

        Person userAdvanceLambda = optionalUser.orElseGet(() -> new Person("StefanLAMBDA", "MandradzhiyskiLAMBDA", 24));
        userAdvanceLambda.setAddress(address);
        System.out.println(userAdvanceLambda.getFirstName());

        optionalUser = Optional.ofNullable(userAdvanceLambda);
        optionalUser.map(Person::getAddress)
                .filter(addresss -> addresss.getCity().equals("Plovdiv"))
                .ifPresent(k -> {
                    System.out.printf(PRESENT_PERSON, k, address.getCity());
                });
    }

}
