package com.hybris.valexandrovich.java_se.lecture_37;

public class Sequence {
    int value;

    public synchronized int nextValue() {
        value++;
        return value;
    }
}
