package com.hybris.valexandrovich.java_ee.lecture_118;

import com.hybris.valexandrovich.Logger;
import org.w3c.dom.ls.LSOutput;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Logger.addLine("------- " + Application.class.getName() + " -------");
        LocalDate date = LocalDate.of(2010, Month.APRIL, 15);
        LocalTime time = LocalTime.of(11, 22, 33);

        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_TIME));

        Logger.addLine(dateTime.format(DateTimeFormatter.ISO_DATE));
        Logger.addLine(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        Logger.addLine(dateTime.format(DateTimeFormatter.ISO_TIME));

        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
//        DateTimeFormatter fullFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

        System.out.println(shortFormatter.format(date));
        Logger.addLine(shortFormatter.format(date));
//        System.out.println(shortFormatter.format(time));
        System.out.println(shortFormatter.format(dateTime));
        Logger.addLine(shortFormatter.format(dateTime));


        DateTimeFormatter formatter=  DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(dateTime.format(formatter));
        Logger.addLine(dateTime.format(formatter));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm");
        System.out.println(simpleDateFormat.format(new Date()));
        Logger.addLine(simpleDateFormat.format(new Date()));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(dtf.format(dateTime));
        Logger.addLine(dtf.format(dateTime));
//        System.out.println(dtf.format(date));
        System.out.println(dtf.format(time));
        Logger.addLine(dtf.format(time));

    }
}
