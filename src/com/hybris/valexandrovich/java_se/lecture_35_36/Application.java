package com.hybris.valexandrovich.java_se.lecture_35_36;

import com.hybris.valexandrovich.Logger;

public class Application {
    public static void main(String[] args) {

        Logger.addLine("------- " + Application.class.getName() + " -------");

        System.out.println("Starting Thread 1");
        Logger.addLine("Starting Thread 1");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Number: " + i + " - " + Thread.currentThread().getName());
                    Logger.addLine("Number: " + i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();

        System.out.println("Hello there ... ");
        Logger.addLine("Hello there ... ");

        System.out.println("Starting Thread 2");
        Logger.addLine("Starting Thread 2");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Number: " + i + " - " + Thread.currentThread().getName());
                    Logger.addLine("Number: " + i + " - " + Thread.currentThread().getName());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t2.start();
    }
}

class Task implements Runnable {

    String name;

    public Task(String name) {
        this.name = name;
    }

    public void run() {
        Thread.currentThread().setName(name);
        for (int i = 0; i < 1000; i++) {
            System.out.println("Number: " + i + " - " + Thread.currentThread().getName());
            Logger.addLine("Number: " + i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
