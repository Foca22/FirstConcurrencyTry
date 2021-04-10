package com.concurrency;

import java.util.Random;

public class RandomThread implements Runnable{
    int number;
    String threadName;
    Random randomNumber = new Random();

    public RandomThread(String threadName) {
        this.threadName = threadName;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return threadName;
    }

    @Override
    public void run() {
        number = randomNumber.nextInt(10) + 1;
        //System.out.println("Thread " + threadName + " has generated " + number);
    }
}
