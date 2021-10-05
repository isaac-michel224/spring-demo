package com.tts.spring.demo.controller;

import com.tts.spring.demo.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;


//below I am using  the rest controller
//this allows me to create a restful service
//that will expose resources over URLs
@RestController
public class HelloController {




    @GetMapping("/hello")
    public String getHello() {

        return "Hello World from Spring Boot!";
    }

    //below we are exposing as a resource an instance of person
    //this instance will take the shape of JSON object
    //ALLOWING IT TO BE EASILY CONSUMED BY AND FRONTEND SOLUTION
    @GetMapping("/bob")
    public Person getBob() {
        return new Person("Bob",
                "Smith",
                LocalDate.of(1990, 1, 1));
    }

}
