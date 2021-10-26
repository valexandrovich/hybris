package com.hybris.valexandrovich.java_se.lecture_39;

import com.hybris.valexandrovich.Logger;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        Logger.addLine("------- " + Application.class.getName() + " -------");

        ArrayList<Integer> questionList = new ArrayList<>();
        Thread t1 = new Thread(new Producer(questionList));
        Thread t2 = new Thread(new Consumer(questionList));

        t1.start();
        t2.start();
    }
}
