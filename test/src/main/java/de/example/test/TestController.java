package de.example.test;

import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
@CrossOrigin
public class TestController{

    @GetMapping("/")
    public String home() {
        return "Hello from Spring Boot";
    }
    

}