package com.tts.spring.demo.service;


import com.tts.spring.demo.model.Person;
import com.tts.spring.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//this is the implementation for our service implementation
@Service
public class PersonServiceImpl implements PersonService{
    //recall that autowired is a form of dependency injection
    //via annotations. We can also utilize constructor based
    //dependency injection

    @Autowired
    PersonRepository personRepository;

    //this is the constructor based dependency injection
    // public PersonServiceImpl(PersonRepository personRepository) {
    //this.personRepository = personRepository;}

    @Override
    public Person getPersonById(Long id) {
        return personRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Person> getAllPersons() {
        return (List<Person>) personRepository.findAll();
    }

    @Override
    public List<Person> getAllById(List<Long> id) {
        return (List<Person>) personRepository.findAllById(id);
    }

    @Override
    public List<Person> getPersonByFirstName(String firstName) {
        return personRepository.findAllByFirstName(firstName);
    }


}
