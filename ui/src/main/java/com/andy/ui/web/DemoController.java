package com.andy.ui.web;

import com.andy.ui.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell on 2017/10/17.
 */
@RestController
public class DemoController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "/save/person", method = RequestMethod.GET)
    public String savePerson(@RequestParam("name") String name, @RequestParam("age") String age) {

        return personService.save(name, Integer.valueOf(age));
    }



}
