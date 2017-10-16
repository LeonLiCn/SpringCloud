package com.example.demo.dao;

import com.example.demo.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by andy on 2017/10/16.
 */
public interface PersonDao extends JpaRepository<Person, Integer> {

}
