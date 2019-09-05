package com.snmi.thread;

import com.snmi.thread.zoo.Bird;
import com.snmi.thread.zoo.Cat;
import com.snmi.thread.zoo.Dog;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * The program show simple two implementation of threads
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class ProgramThread {

    public static void main(String[] args) {
        Dog firstDog = new Dog("BARK");
        Thread firstDogThread = new Thread(firstDog);
        firstDogThread.start();

        Cat cat = new Cat("MYA");
        Cat secondCat = new Cat("SECOND MYA");
        Bird bird = new Bird("KVA-KVA");
        Bird secondBird = new Bird("SECOND KVA-KVA");
        Dog secondDog = new Dog("SECOND BARK");

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(cat);
        executorService.submit(bird);
        executorService.submit(secondDog);

        for (int i = 0; i <= 100; i++){
            System.out.println("MAIN SYSTEM");
        }

        executorService.submit(secondCat);
        executorService.submit(secondBird);
        executorService.shutdown();
    }

}
