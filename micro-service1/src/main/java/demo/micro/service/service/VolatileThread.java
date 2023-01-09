package main.java.demo.micro.service.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VolatileThread extends Thread {
    Logger log = LoggerFactory.getLogger(VolatileThread.class);
    private final VolatileData data;

    public VolatileThread(VolatileData data) {
        this.data = data;
    }

    @Override
    public void run() {
        int oldValue = data.getCounter();
        log.info("[Thread " + Thread.currentThread().getId() + "]: Old value = " + oldValue);
        data.incrementCounter();
        int newValue = data.getCounter();
        log.info("[Thread " + Thread.currentThread().getId() + "]: New value = " + newValue);
    }
}
