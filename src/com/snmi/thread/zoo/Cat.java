package com.snmi.thread.zoo;

import com.snmi.thread.Counter;

/**
 * Cat object
 * @author Stefan Mandradzhiyski
 * @version 1.0
 */
public class Cat implements Runnable{

    /**
     * Variable
     */
    private String makeNoise;

    /**
     * Default constructor
     */
    public Cat() {}

    /**
     * Custom constructor
     * @param makeNoise take the noise
     */
    public Cat(String makeNoise) {
        this.makeNoise = makeNoise;
    }

    /**
     * Synchronized method in which only one thread can enter in
     */
    private synchronized void increaseCounter() {
        Counter.threadCounts++;
        System.out.println(makeNoise + " " + Counter.threadCounts);
    }

    /**
     * Implementation of Runnable run method
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            increaseCounter();
        }
    }

}
