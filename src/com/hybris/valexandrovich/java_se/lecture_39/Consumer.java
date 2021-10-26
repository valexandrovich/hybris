package com.hybris.valexandrovich.java_se.lecture_39;

import com.hybris.valexandrovich.Logger;

import java.util.List;

public class Consumer implements Runnable {
    List<Integer> questionsList;

    public Consumer(List<Integer> questionsList) {
        this.questionsList = questionsList;
    }

    public void answerQuestion() throws InterruptedException {
        synchronized (questionsList) {
            while (questionsList.isEmpty()) {
                System.out.println("Waiting for Producer to get questions");
                Logger.addLine("Waiting for Producer to get questions");
                questionsList.wait();
            }
        }

        synchronized (questionsList) {
            Thread.sleep(5000);
            int questionNumber = questionsList.remove(0);
            System.out.println("Answered question " + questionNumber);
            Logger.addLine("Answered question " + questionNumber);
            questionsList.notify();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                answerQuestion();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
