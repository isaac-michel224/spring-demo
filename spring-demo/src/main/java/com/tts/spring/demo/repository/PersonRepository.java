package com.tts.spring.demo.repository;

import com.tts.spring.demo.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

List<Person> findAllByFirstName(String firstName);
}
