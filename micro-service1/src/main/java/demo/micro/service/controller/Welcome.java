package main.java.demo.micro.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController("/api")
@EnableSwagger2
public class Welcome {
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String getWelcomeMessage(){
        return "Welcome! Gunners #COYG";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getTest(){
        return "Test";
    }
}
