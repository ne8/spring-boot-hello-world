package ro.example.helloworld.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldController.class);

    private static final String HELLO_WORLD = "Hello world!";

    @RequestMapping(value = "/hello-world",method = RequestMethod.GET)
    public String showHelloWorldMessage(){
        LOGGER.info("hello world from log!");
        return HELLO_WORLD;
    }
}
