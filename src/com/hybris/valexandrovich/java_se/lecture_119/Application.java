package com.hybris.valexandrovich.java_se.lecture_119;

import com.hybris.valexandrovich.Logger;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Application {
    public static void main(String[] args) {
        Logger.addLine("------- " + Application.class.getName() + " -------");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("02 15 2010", formatter);
        LocalTime time = LocalTime.parse("11:22");

        System.out.println(date);
        Logger.addLine(String.valueOf(date));
        System.out.println(time);
        Logger.addLine(String.valueOf(time));

        String text = date.format(formatter);
        System.out.println(text);
        Logger.addLine(text);
        LocalDate parsedDate = LocalDate.parse(text, formatter);
        System.out.println(parsedDate);
        Logger.addLine(String.valueOf(parsedDate));

        LocalDate myDate = LocalDate.of(2020, Month.MAY, 23);
        myDate.plusMonths(1).plusDays(5);
        System.out.println(formatter.format(myDate));
        Logger.addLine(formatter.format(myDate));

    }
}
