package com.MYSPRING.Quickstarter.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworldcontroller {

    @GetMapping(path = "/hello")
    public String Helloworld() {
        return "Hello World";
    }
    @GetMapping(path = "/")
    public String Home() {
        return "Home page";
    }
}
