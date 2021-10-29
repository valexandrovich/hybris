package com.hybris.valexandrovich.java_se.lecture_39;

import com.hybris.valexandrovich.Logger;

import java.util.List;

public class Consumer implements Runnable {
    List<Integer> questionsList;
    boolean isLastQuestionAnswered = false;

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
            Thread.sleep(2000);
            int questionNumber = questionsList.remove(0);
            System.out.println("Answered question " + questionNumber);
            Logger.addLine("Answered question " + questionNumber);
            if (questionNumber == 10) isLastQuestionAnswered = true;
            questionsList.notify();


        }
    }

    @Override
    public void run() {
        while (!isLastQuestionAnswered) {
            try {
                answerQuestion();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
