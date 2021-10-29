package com.hybris.valexandrovich.java_se.lecture_37;

import com.hybris.valexandrovich.Logger;

public class Application {
    public static void main(String[] args) {
        System.out.println("------- " + Application.class.getName() + " -------");
        Logger.addLine("------- " + Application.class.getName() + " -------");
        Sequence sequence = new Sequence();

        Worker worker1 = new Worker(sequence);
        worker1.start();

        Worker worker2 = new Worker(sequence);
        worker2.start();

        try {
            worker1.join();
            worker2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class Worker extends Thread {
    Sequence sequence;

    public Worker(Sequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            int value = sequence.nextValue();
            System.out.println(Thread.currentThread().getName() + " got value " + value);
            Logger.addLine(Thread.currentThread().getName() + " got value " + value);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
