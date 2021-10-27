package com.hybris.valexandrovich.java_se.lecture_41;

import com.hybris.valexandrovich.Logger;

public class MessageProcessor implements Runnable {
    private int message;

    public MessageProcessor(int message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +  " [RECIVED] Message = " + message);
        Logger.addLine(Thread.currentThread().getName() + " [RECIVED] Message = " + message);
        respondToMessage();
        System.out.println(Thread.currentThread().getName() +  " [DONE] Message = " + message);
        Logger.addLine(Thread.currentThread().getName() +  " [DONE] Message = " + message);
    }

    private void respondToMessage() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Unable to process message " + message);
            Logger.addLine("Unable to process message " + message);
        }
    }
}
