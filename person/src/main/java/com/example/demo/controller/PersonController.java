package com.example.demo.controller;

import com.example.demo.dao.PersonDao;
import com.example.demo.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by andy on 2017/10/16.
 */
@RestController
public class PersonController {

    @Autowired
    PersonDao dao;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@RequestParam("name") String name, @RequestParam("age") Integer age) {

        Person person = new Person();
        person.setName(name);
        person.setAge(age);

        person = dao.save(person);

        return person.getId().toString();
    }

    @GetMapping(value = "/list")
    public List<Person> get() {
        return dao.findAll();
    }



}
