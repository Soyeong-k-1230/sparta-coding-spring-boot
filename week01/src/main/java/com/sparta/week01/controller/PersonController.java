package com.sparta.week01.controller;

import com.sparta.week01.prac.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getPerson() {
        Person person = new Person();
        person.setName("Yeong Kim");
        person.setAge(27);
        person.setAddress("South Korea");
        person.setJob("Programmer");

        return person;
    }
}
