package com.hybris.valexandrovich.java_se.lecture_26;

import com.hybris.valexandrovich.Logger;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        Logger.addLine("------- " + Application.class.getName() + " -------");

        List<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("cat");
        animals.add("Dog");
        animals.add("Bird");

        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle vehicle2 = new Vehicle("Toyota", "Camry", 12000, false);
        vehicles.add(new Vehicle("Honda", "Accord", 12000, false));
        vehicles.add(vehicle2);
        vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));

        printElements(vehicles);
        printElements(animals);

    }

    public static void printElements(List someList) {
        for (int i = 0; i < someList.size(); i++) {
            System.out.println(someList.get(i));
            Logger.addLine(String.valueOf(someList.get(i)));
        }
    }

}
