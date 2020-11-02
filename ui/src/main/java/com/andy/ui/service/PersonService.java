package com.andy.ui.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by andy on 2017/10/16.
 */
@FeignClient("person")
public interface PersonService {

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    String save(@RequestParam("name") String name, @RequestParam("age") Integer age);
}
