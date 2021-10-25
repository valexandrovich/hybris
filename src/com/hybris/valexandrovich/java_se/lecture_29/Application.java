package com.hybris.valexandrovich.java_se.lecture_29;

import com.hybris.valexandrovich.Logger;

import java.util.Map;
import java.util.TreeMap;

public class Application {
    public static void main(String[] args) {

        Logger.addLine("------- " + Application.class.getName() + " -------");

        TreeMap<String, String> dictionary = new TreeMap<String, String>();
        dictionary.put("Brave", "ready to face and endure danger or pain; showing courage");
        dictionary.put("Brillant", "exceptionally clever or talanted");
        dictionary.put("Joy", "a felling of great pleasure and happiness");
        dictionary.put("Confidence", "the state of feeling certain about the truth of something");

        dictionary.put("Brillant", "xxxxxxxx");

        for(Map.Entry<String, String> entry : dictionary.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
            Logger.addLine(entry.getKey() + " : " + entry.getValue());
        }
    }
}
