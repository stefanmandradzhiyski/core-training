package com.snmi.lambda;

import java.util.*;
import java.util.function.*;

/**
 * The program shows little implementations of lambda expressions
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramLambda {

    public static void main(String[] args) {
        //Compare strings length
        Comparator<String> comparableShorter = Comparator.comparingInt(String::length);

        Runnable r = () -> {
            int i = 0;
            while (i++ < 10) {
                System.out.println("It works");
            }
        };

        Function<LambdaPerson, String> f = LambdaPerson::getFirstName;

        BinaryOperator<Integer> sum = Integer::sum;

        Consumer<String> printer = System.out::println;

        Comparator<LambdaPerson> comparatorAge = Comparator.comparingInt(LambdaPerson::getAge);
        Comparator<LambdaPerson> comparatorFirstName = Comparator.comparing(LambdaPerson::getFirstName);
        Comparator<LambdaPerson> comparatorLastName = Comparator.comparing(LambdaPerson::getLastName);

        Function<LambdaPerson, Integer> functionAge = LambdaPerson::getAge;
        Function<LambdaPerson, String> functionFirstName = LambdaPerson::getFirstName;
        Function<LambdaPerson, String> functionLastName = LambdaPerson::getLastName;

        Comparator<LambdaPerson> comparatorWithFunctionAge = Comparator.comparing(functionAge);
        Comparator<LambdaPerson> comparatorWithFunctionFirstName = Comparator.comparing(functionFirstName);
        Comparator<LambdaPerson> comparatorWithFunctionLastName = Comparator.comparing(functionLastName);

        Consumer<LambdaPerson> lambdaPersonConsumer = lpc -> System.out.println(lpc.getFirstName());
        Supplier<LambdaPerson> lambdaPersonSupplier = LambdaPerson::new;
        Function<LambdaPerson, Integer> lambdaPersonIntegerFunction = LambdaPerson::getAge;
        Predicate<LambdaPerson> lambdaPersonPredicate = lpp -> lpp.getAge() > 20;

        LambdaPerson lambdaPerson = new LambdaPerson();
        lambdaPerson.setAge(21);
        boolean a = lambdaPersonPredicate.test(lambdaPerson);
        System.out.println(a);

        List<LambdaPerson> lambdaPersonList = new ArrayList<>();
        lambdaPersonList.add(new LambdaPerson("Stefan","Mandradzhiyski",24));
        lambdaPersonList.add(new LambdaPerson("Chefo","Mandradzhiyski",20));
        lambdaPersonList.add(new LambdaPerson("Mistyr","Mistrov",34));
        lambdaPersonList.forEach(System.out::println);
        lambdaPersonList.removeIf(lpl -> lpl.getFirstName().equals("Chefo"));

        System.out.println("After delete");
        lambdaPersonList.forEach(System.out::println);

        Map<String, List<LambdaPerson>> cities = new HashMap<>();
        cities.put("Plovdiv", lambdaPersonList);

        cities.forEach((city,list) -> System.out.println(city + " population is: " + list.size()));
        System.out.println(cities.getOrDefault("Sofia",Collections.emptyList()));

        cities.putIfAbsent("Sofia", new ArrayList<>());
        System.out.println("Population on desired city is: " + cities.get("Sofia").size());

        List<LambdaPerson> lambdaPersonListNew = new ArrayList<>();
        lambdaPersonListNew.add(new LambdaPerson("Stefan","Mandradzhiyski",24));
        lambdaPersonListNew.add(new LambdaPerson("Chefo","Mandradzhiyski",20));
        lambdaPersonListNew.add(new LambdaPerson("Mistyr","Mistrov",34));
        cities.replace("Plovdiv", lambdaPersonListNew);
        System.out.println(cities.get("Plovdiv").size());

        cities.computeIfAbsent("Sofia", key -> new ArrayList<>()).add(new LambdaPerson("John","Mandradzhiyski",23));
        System.out.println(cities.get("Sofia").size());
    }

}
