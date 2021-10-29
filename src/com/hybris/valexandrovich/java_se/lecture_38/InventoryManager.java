package com.hybris.valexandrovich.java_se.lecture_38;

import com.hybris.valexandrovich.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
    List<Product> soldProductsList = new CopyOnWriteArrayList<>();
    List<Product> purchasedProductsList = new ArrayList<>();

    public void populateSoldProducts() {
        for (int i = 0; i < 100; i++) {
            Product product = new Product(i, "test_product_" + i);
            soldProductsList.add(product);
            System.out.println("ADDED " + product);
            Logger.addLine("ADDED " + product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void displaySoldProducts() {
        for (Product product : soldProductsList) {
            System.out.println("SOLD: " + product);
            Logger.addLine("SOLD: " + product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
