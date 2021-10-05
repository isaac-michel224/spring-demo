package com.tts.spring.demo.service;


import com.tts.spring.demo.model.Person;

import java.util.List;

//this interface will serve as a contract that will
//dictate what functionality your app will have
public interface PersonService {
    //get method by ID value
    Person getPersonById(Long id);
    //get all persons
List<Person> getAllPersons();

List<Person> getAllById(List<Long> id);
List<Person> getPersonByFirstName(String firstName);
}
