package com.andy.ui.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by andy on 2017/10/16.
 */
@Service
public class PersonHystrixSrevice {

    @Autowired
    PersonService personService;

    @HystrixCommand(fallbackMethod = "fallbackSave")
    public String save(String name, Integer age) {

        return personService.save(name, age);
    }

    public String fallbackSave() {

        return "person service 故障";
    }

}
