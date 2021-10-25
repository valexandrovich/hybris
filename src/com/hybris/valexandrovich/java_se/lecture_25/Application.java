package com.hybris.valexandrovich.java_se.lecture_25;

import com.hybris.valexandrovich.Logger;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {

        Logger.addLine("------- " + Application.class.getName() + " -------");

        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("there");
        words.add("10");

        String item1 = words.get(2);
        System.out.println(item1);
        Logger.addLine(item1);

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(45);
        numbers.add(1000);
        numbers.removeFirst();

        for (int number : numbers){
            System.out.println(number);
            Logger.addLine(String.valueOf(number));
        }
    }
}