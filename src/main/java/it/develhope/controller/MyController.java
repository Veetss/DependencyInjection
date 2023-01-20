package it.develhope.controller;

import it.develhope.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private MyService service;

    public MyController(MyService service) {
        this.service = service;
        System.out.println("MyController constructor has been called");
    }

    @GetMapping
    public String welcome(){
        return "Welcome!";
    }

    @GetMapping("/getName")
    public String getName(){
        return service.getName();
    }

}
