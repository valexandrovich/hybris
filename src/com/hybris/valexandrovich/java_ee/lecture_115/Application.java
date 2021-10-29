package com.hybris.valexandrovich.java_ee.lecture_115;

import com.hybris.valexandrovich.Logger;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class Application {
    public static void main(String[] args) {

        Logger.addLine("------- " + Application.class.getName() + " -------");

        System.out.println(LocalDate.now());
        Logger.addLine(String.valueOf(LocalDate.now()));
        System.out.println(LocalTime.now());
        Logger.addLine(String.valueOf(LocalTime.now()));
        System.out.println(LocalDateTime.now());
        Logger.addLine(String.valueOf(LocalDateTime.now()));

        LocalDate localDate = LocalDate.of(2017, Month.JANUARY, 23);
        LocalTime localTime = LocalTime.of(22, 55);

        System.out.println(localDate);
        Logger.addLine(String.valueOf(localDate));
        System.out.println(localTime);
        Logger.addLine(String.valueOf(localTime));
        System.out.println(LocalDateTime.of(localDate, localTime));
        Logger.addLine(String.valueOf(LocalDateTime.of(localDate, localTime)));

        // before Java 8
        System.out.println(new Date());
        Logger.addLine(String.valueOf(new Date()));

        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, Calendar.JANUARY, 20);
        Date dt = calendar.getTime();
        System.out.println(dt);
        Logger.addLine(String.valueOf(dt));

    }
}
