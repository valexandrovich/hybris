package com.hybris.valexandrovich.java_se.lecture_116;

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

        LocalDate localDate = LocalDate.of(2030, Month.JANUARY, 10);
        System.out.println(localDate);
        Logger.addLine(String.valueOf(localDate));
        localDate = localDate.plusDays(5).plusMonths(2);
        System.out.println(localDate);
        Logger.addLine(String.valueOf(localDate));

        LocalTime localTime = LocalTime.of(10, 30);
        System.out.println(localTime);
        Logger.addLine(String.valueOf(localTime));
        localTime = localTime.plusHours(2).plusMinutes(20);
        System.out.println(localTime);
        Logger.addLine(String.valueOf(localTime));

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime);
        Logger.addLine(String.valueOf(localDateTime));
        localDateTime = localDateTime.minusHours(10).plusDays(2).plusWeeks(1);
        System.out.println(localDateTime);
        Logger.addLine(String.valueOf(localDateTime));

        // before Java 8
        Date myDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(myDate);
        calendar.set(Calendar.DATE, 1);
        calendar.set(Calendar.MONTH, 1);
        myDate = calendar.getTime();
        System.out.println(myDate);
        Logger.addLine(String.valueOf(myDate));

        // exam tricks
        LocalDate id = LocalDate.of(2010, Month.APRIL, 1);
        id.plusDays(10);
        System.out.println(id);
        Logger.addLine(String.valueOf(id));
    }
}
