package com.hybris.valexandrovich.java_se.lecture_40;

import com.hybris.valexandrovich.Logger;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    BlockingQueue<Integer> questionQueue;
    int questionNumber;

    public Producer(BlockingQueue<Integer> questionQueue) {
        this.questionQueue = questionQueue;
    }

    @Override
    public void run() {
        while (true) {
            if (questionNumber > 10) return;
            try {
                synchronized (this) {
                    int nextQuestion = questionNumber++;
                    System.out.println("NEW QUESTION " + nextQuestion);
                    Logger.addLine("NEW QUESTION " + nextQuestion);
                    questionQueue.put(nextQuestion);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

//    public synchronized int getNextQuestion(){
//        int nextQuestion = questionNumber++;
//        System.out.println("Got new question " + nextQuestion);
//        return nextQuestion;
//    }
}
