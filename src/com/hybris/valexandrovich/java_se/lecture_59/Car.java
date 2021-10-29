package com.hybris.valexandrovich.java_se.lecture_59;

import com.hybris.valexandrovich.Logger;

public class Car {
    String make, model, color;
    int price;

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public void printCar(){
        System.out.println(this);
        Logger.addLine(String.valueOf(this));
    }

    public Car(String make, String model, String color, int price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
