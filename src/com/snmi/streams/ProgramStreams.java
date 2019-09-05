package com.snmi.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * The program show little implementation of awesome Stream API
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramStreams {

    public static void main(String[] args) {
        //Constant stream
        Stream<String> stringStreamFirst = Stream.generate(() -> "one");
        stringStreamFirst.limit(10).forEach(System.out::println);

        //Growing stream
        Stream<String> stringStreamSecond = Stream.iterate("+", s -> s + "+");
        stringStreamSecond.limit(5).forEach(System.out::println);

        //A random stream
        ThreadLocalRandom.current().ints();

        //Letters stream
        IntStream intStream = "Hello".chars();

        //Stream Builder
        Stream.Builder<String> streamBuilder = Stream.builder();
        streamBuilder.add("One"); //return
        streamBuilder.accept("Two"); //doesn't return
        Stream<String> stringStream = streamBuilder.build();
        stringStream.forEach(System.out::println);

        //Stream
        System.out.println("Employee here");
        List<Employee> allEmployee = new ArrayList<>();
        allEmployee.add(new Employee("Chefo",24));
        allEmployee.add(new Employee("Stefan",23));
        allEmployee.add(new Employee("Befcho",18));
        allEmployee.add(new Employee("SNMI",24));
        allEmployee.stream()
                .skip(1) //skip one element
                .limit(1)//limit next result to one element
                .map(Employee::getAge) //get age of employee
                .filter(age -> age > 20) //filter employee older than 20 years
                .forEach(System.out::println); //print employee after filter

        boolean match = allEmployee.stream()
                .anyMatch(e -> e.getAge() > 20);
              //.allMatch(e -> e.getAge() > 20);
              //.noneMatch(e -> e.getAge() > 20);
        System.out.println(match);

        Optional<Employee> optionalEmployee = allEmployee.stream().findFirst();
        System.out.println(optionalEmployee);
    }

}
