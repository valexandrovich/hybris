package com.hybris.valexandrovich.java_se.lecture_40;


import com.hybris.valexandrovich.Logger;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Application {
    public static void main(String[] args) {

        Logger.addLine("------- " + Application.class.getName() + " -------");

        BlockingQueue<Integer> questionQueue = new ArrayBlockingQueue<Integer>(5);
        Thread t1 = new Thread(new Producer(questionQueue));
        Thread t2 = new Thread(new Consumer(questionQueue));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
