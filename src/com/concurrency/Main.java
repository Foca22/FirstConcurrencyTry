package com.concurrency;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        RandomThread randomThread1 = new RandomThread("thread1");
        RandomThread randomThread2 = new RandomThread("thread2");
        RandomThread randomThread3 = new RandomThread("thread3");
        RandomThread randomThread4 = new RandomThread("thread4");
        RandomThread randomThread5 = new RandomThread("thread5");
        Thread thread1 = new Thread(randomThread1);
        Thread thread2 = new Thread(randomThread2);
        Thread thread3 = new Thread(randomThread3);
        Thread thread4 = new Thread(randomThread4);
        Thread thread5 = new Thread(randomThread5);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Random number generated for " + randomThread1.getName() + " is: " + randomThread1.getNumber());
        System.out.println("Random number generated for " + randomThread2.getName() + " is: " + randomThread2.getNumber());
        System.out.println("Random number generated for " + randomThread3.getName() + " is: " + randomThread3.getNumber());
        System.out.println("Random number generated for " + randomThread4.getName() + " is: " + randomThread4.getNumber());
        System.out.println("Random number generated for " + randomThread5.getName() + " is: " + randomThread5.getNumber());


        // 1st point of the homework
        int sumOfThreadsStandard = randomThread1.number + randomThread2.number + randomThread3.number + randomThread4.number + randomThread5.number;
        System.out.println("Sum of threads = " + sumOfThreadsStandard);

        // 2nd point of the homework
        List<Integer> threadList = new LinkedList<>();
        threadList.add(randomThread1.number);
        threadList.add(randomThread2.number);
        threadList.add(randomThread3.number);
        threadList.add(randomThread4.number);
        threadList.add(randomThread5.number);


        int sumOfThreadsCollection = 0;
        for (Integer threadIterator : threadList) {
            sumOfThreadsCollection += threadIterator;
        }

        System.out.println("Sum of threads using collections = " + sumOfThreadsCollection);
    }


}
