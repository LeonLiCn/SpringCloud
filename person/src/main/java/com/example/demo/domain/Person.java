package com.example.demo.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by andy on 2017/9/26.
 */
@Entity
@Data
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

}
