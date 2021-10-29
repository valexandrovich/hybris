package com.hybris.valexandrovich.java_se.lecture_39;

import com.hybris.valexandrovich.Logger;

import java.util.List;

public class Producer implements Runnable {

    List<Integer> questionsList;
    final int LIMIT = 5;

    public Producer(List<Integer> questionsList) {
        this.questionsList = questionsList;
    }

    public void readQuestion(int questionNumber) throws InterruptedException {
        synchronized (questionsList) {
            while (questionsList.size() == LIMIT) {
                System.out.println("Questions have pilled up... wait for answers");
                Logger.addLine("Questions have pilled up... wait for answers");
                questionsList.wait();
            }
        }

        synchronized (questionsList) {
            System.out.println("New question " + questionNumber);
            Logger.addLine("New question " + questionNumber);
            questionsList.add(questionNumber);
            Thread.sleep(100);
            questionsList.notify();
        }
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                readQuestion(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
