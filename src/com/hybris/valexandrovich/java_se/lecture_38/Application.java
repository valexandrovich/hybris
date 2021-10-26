package com.hybris.valexandrovich.java_se.lecture_38;

import com.hybris.valexandrovich.Logger;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        Logger.addLine("------- " + Application.class.getName() + " -------");
        InventoryManager inventoryManager = new InventoryManager();
        Thread inventoryTask = new Thread(new Runnable() {
            @Override
            public void run() {
                inventoryManager.populateSoldProducts();
            }
        });

        Thread displayTask = new Thread(new Runnable() {
            @Override
            public void run() {
                inventoryManager.displaySoldProducts();
            }
        });

        inventoryTask.start();
        Thread.sleep(2000);
        displayTask.start();
    }
}
