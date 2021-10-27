package com.hybris.valexandrovich.java_se.lecture_40;

import com.hybris.valexandrovich.Logger;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {


    BlockingQueue<Integer> questionQueue;

    public Consumer(BlockingQueue<Integer> questionQueue) {
        this.questionQueue = questionQueue;
    }


    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                int question = questionQueue.take();
                System.out.println("ANSWERED QUESTION " + question);
                Logger.addLine("ANSWERED QUESTION " + question);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
