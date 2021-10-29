package com.hybris.valexandrovich.java_se.lecture_60;

import com.hybris.valexandrovich.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) throws IOException, InterruptedException {
        Logger.addLine("------- " + Application.class.getName() + " -------");
        IntStream
                .range(1, 10)
                .forEach(value -> {
                    System.out.print(value);
                    Logger.addChar(String.valueOf(value));
                });
        System.out.println();
        Logger.addLine("");

        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(value -> {
                    System.out.print(value);
                    Logger.addChar(String.valueOf(value));
                });
        System.out.println();
        Logger.addLine("");

        int val = IntStream.range(1, 5).sum();
        System.out.println(val);
        Logger.addLine(String.valueOf(val));

        Stream.of("Hello", "Bottle", "Africa")
                .sorted()
                .findFirst()
                .ifPresent(s -> {
                    System.out.println(s);
                    Logger.addLine(s);

                });

        String[] items = {"car", "computer", "toothpaste", "box", "pencil", "tent", "door", "toy"};
        Stream.of(items)
                .filter(s -> s.startsWith("t"))
                .sorted()
                .forEach(s -> {
                    System.out.print(s + ", ");
                    Logger.addChar(s + ", ");
                });
        System.out.println();
        Logger.addLine("");

        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(value -> {
                    System.out.print(value);
                    Logger.addChar(String.valueOf(value));

                });
        System.out.println();
        Logger.addLine("");

        List<String> listOfItems = Arrays.asList("Computer", "Toothpaste", "Box", "Pencil", "Tent", "Door", "Toy", "Car");
        listOfItems.stream()
                .map(x -> x.toLowerCase())
                .filter(x -> x.startsWith("c"))
                .sorted()
                .forEach(s -> {
                    System.out.print(s + ", ");
                    Logger.addChar(s + ", ");
                });
        System.out.println();
        Logger.addLine("");

        Stream<String> lines = Files.lines(Paths.get("files/wordFile.txt"));
        lines
                .sorted()
                .filter(s -> s.length() > 6)
                .forEach(s -> {
                    System.out.print(s + ", ");
                    Logger.addChar(s + ", ");
                });
        lines.close();
        System.out.println();
        Logger.addLine("");

        List<String> lines2 = Files.lines(Paths.get("files/wordFile.txt"))
                .filter(s -> s.contains("th"))
                .collect(Collectors.toList());
        lines2.forEach(s -> {
            System.out.print(s + ", ");
            Logger.addChar(s + ", ");
        });
        System.out.println();
        Logger.addLine("");

        Stream<String> rows = Files.lines(Paths.get("files/stockDataCsv.txt"));
        int rowCount = (int) rows
                .map(s -> s.split(","))
                .filter(s -> s.length > 3)
                .count();
        System.out.println(rowCount + " good rows");
        Logger.addLine(rowCount + " good rows");
        rows.close();

        Stream<String> rows2 = Files.lines(Paths.get("files/stockDataCsv.txt"));
        rows2
                .map(x -> x.split(","))
                .filter(s -> s.length > 3)
                .filter(x -> Integer.parseInt(x[1].trim()) > 15)
                .forEach(x -> {
                    System.out.println(x[0].trim() + " " + x[2].trim() + " " + x[3].trim());
                    Logger.addLine(x[0].trim() + " " + x[2].trim() + " " + x[3].trim());
                });
        rows2.close();
    }
}
