package com.tts.spring.demo;

import com.tts.spring.demo.model.Person;
import com.tts.spring.demo.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;


@Component
public class MyRunner {

    @Bean
    public CommandLineRunner runner(PersonRepository personRepository) {
        return (args) -> {
            personRepository.save(new Person("Mickey", "Mouse", LocalDate.MIN));
            personRepository.save(new Person("Minney", "Mouse", LocalDate.MIN));
            personRepository.save(new Person("Donald", "Duck", LocalDate.MIN));
        };
    }
}
//    @Override
//    public void run() {
//        System.out.println("hello World from a runnable!");
//    }

