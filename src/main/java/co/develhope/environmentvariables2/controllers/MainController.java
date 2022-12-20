package co.develhope.environmentvariables2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private Environment environment;

    @GetMapping("/test")
    public String getMessageTest(){
        String test = environment.getProperty("welcomeMsg");
        return test;
    }

    @GetMapping("/prod")
    public String getMessageProd(){
        String prod = environment.getProperty("welcomeMsg");
        return prod;
    }
}