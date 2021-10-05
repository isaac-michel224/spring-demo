package com.tts.spring.demo.controller;

import com.tts.spring.demo.model.Person;


import com.tts.spring.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;

//GetMapping is an amalgamation of RequestMapping and ResponseBody
//this aligns one to one with the GET HTTP Method
//the other methods are also represented via:
//@PostMapping, @PutMapping, @DeleteMapping, @PatchMapping
    @GetMapping("/get/all")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    //below we are utilizing a path variable for
    //this allows us to generate unique urls for unique resources
    @GetMapping("/get/{id}")
    public Person getPersonById(@PathVariable Long id) {
        return personService.getPersonById(id);
    }
    //below we are utilizing request parameters which allows us to specify
    //perform searches in a standardized fashion and
    //we query our database using specific values and resolve the code accordingly
    @GetMapping("/get/persons")
    public Iterable<Person> getPersons (@RequestParam List<Long> id) {
        return personService.getAllById(id);
    }

    @GetMapping("/search")
    public Iterable<Person> searchPersonsByName(@RequestParam(name="name") String firstName) {
        return personService.getPersonByFirstName(firstName);
    }
        //note that mappings will simply resolve their methods by default
        //here if an end user goes to "/print" they won't get anything useful back to
        //but the application will still something out to the console

        @RequestMapping("/print")
                public void printThing() {
            System.out.println("This is in my console!");
        }

    }



