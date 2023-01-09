package main.java.demo.micro.service.controller;

import demo.micro.service.service.VolatileData;
import demo.micro.service.service.VolatileThread;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
public class VolatileVariable {
    @RequestMapping(value = "/volatile", method = RequestMethod.GET)
    public String getVolatileTest() throws InterruptedException {
        VolatileData volatileData = new VolatileData();
        Thread[] threads = new Thread[2];
        for (int i = 0; i < 2; ++i)
            threads[i] = new VolatileThread(volatileData);
        for (int i = 0; i < 2; ++i) {
            threads[i].start();
            threads[i].join();
        }
        return "VolatileVariable tested successfully";
    }
}
