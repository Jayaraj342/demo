package com.spring.boot.service;

public class VolatileData {
    public volatile int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void incrementCounter() {
        counter++;
    }
}
