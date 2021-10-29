package com.hybris.valexandrovich.java_se.lecture_41;

import com.hybris.valexandrovich.Logger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) {

        Logger.addLine("------- " + Application.class.getName() + " -------");

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable messageProcessor1 = new MessageProcessor(1);
        executor.execute(messageProcessor1);

        Runnable messageProcessor2 = new MessageProcessor(2);
        executor.execute(messageProcessor2);

        Runnable messageProcessor3 = new MessageProcessor(3);
        executor.execute(messageProcessor3);

        Runnable messageProcessor4 = new MessageProcessor(4);
        executor.execute(messageProcessor4);

         executor.shutdown();

//         try  {
//             executor.awaitTermination(2, TimeUnit.SECONDS);
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }

        try {
            executor.awaitTermination(24L, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Submitted all tasks ... ");
        Logger.addLine("Submitted all tasks ... ");


    }
}
