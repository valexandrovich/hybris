package com.hybris.valexandrovich.java_se.lecture_59;

import com.hybris.valexandrovich.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) {

        Logger.addLine("------- " + Application.class.getName() + " -------");
        List<Car> cars = Arrays.asList(
                new Car("Honda", "Accord", "Red", 22300),
                new Car("Honda", "Civic", "Blue", 17700),
                new Car("Toyota", "Land Cruiser", "White", 48500),
                new Car("Toyota", "Corolla", "Black", 16200),
                new Car("Toyota", "Camry", "Blue", 24000),
                new Car("Nissan", "Sentra", "White", 17300),
                new Car("Mitsubishi", "Lancer", "White", 20000),
                new Car("Jeep", "Wrangler", "Red", 24500)
        );

        Function<Car, String> priceAndColor = car -> "Price: " + car.getPrice() + "; Color: " + car.getColor();
        String stringCar = priceAndColor.apply(cars.get(0));
        System.out.println(stringCar);
        Logger.addLine(stringCar);

        System.out.println("Printing cars between $18000 and $22000");
        Logger.addLine("Printing cars between $18000 and $22000");
        printCarsByCondition(cars, car -> 18000<= car.getPrice() && car.getPrice() <= 22000);

        System.out.println("Printing BLUE cars");
        Logger.addLine("Printing BLUE cars");
        printCarsByCondition(cars, car -> car.getColor().equals("Blue"));

    }

    public static void printCarsByCondition(List<Car> cars, Predicate<Car> condition){
        for (Car car : cars){
            if (condition.test(car)){
                car.printCar();
            }
        }
    }

}

