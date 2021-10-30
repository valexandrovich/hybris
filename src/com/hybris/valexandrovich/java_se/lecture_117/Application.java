package com.hybris.valexandrovich.java_se.lecture_117;

import com.hybris.valexandrovich.Logger;

import java.time.*;

public class Application {
    public static void main(String[] args) {

        Logger.addLine("------- " + Application.class.getName() + " -------");

        LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2017, Month.APRIL, 30);
        Period period = Period.ofWeeks(1);

        cleanAnimalCage(start, end);

        System.out.println(start.plus(period));
        Logger.addLine(String.valueOf(start.plus(period)));
        System.out.println(LocalDateTime.now().plus(period));
        Logger.addLine(String.valueOf(LocalDateTime.now().plus(period)));

        Period yearAndMonth = Period.ofWeeks(2);
        System.out.println(yearAndMonth);
        Logger.addLine(String.valueOf(yearAndMonth));

        cleanAnimalCage(start, end, period);

    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end){
        while (start.isBefore(end)){
            System.out.println("Need to clean cage on date = " + start);
            Logger.addLine("Need to clean cage on date = " + start);
            start = start.plusMonths(1);
        }
    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end, Period period){
        while (start.isBefore(end)){
            System.out.println("Need to clean cage on date = " + start);
            Logger.addLine("Need to clean cage on date = " + start);
            start = start.plus(period);
        }
    }
}
