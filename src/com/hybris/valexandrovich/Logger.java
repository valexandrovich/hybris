package com.hybris.valexandrovich;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {

    private final static String filename = "output.log";
    private static PrintWriter pw;

    static {
        try {
            File logFile = new File(filename);
            if (!logFile.exists()) {logFile.createNewFile();}
            pw = new PrintWriter(new FileWriter(filename));
            Runtime.getRuntime().addShutdownHook(
                    new Thread(() -> Logger.closeFile())
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addLine(String line) {
        pw.println(line);
        pw.flush();
    }
    public static void addChar(String line) {
        pw.print(line);
        pw.flush();
    }
    public static void closeFile() {
        addLine("-------------------------------------------------------------\n");
        pw.close();
    }

}
