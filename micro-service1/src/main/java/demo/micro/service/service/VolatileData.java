package main.java.demo.micro.service.service;

public class VolatileData {
    public volatile int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void incrementCounter() {
        counter++;
    }
}
