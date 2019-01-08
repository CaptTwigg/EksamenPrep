package com.example.demo.spring.mvc.view;

import com.example.demo.spring.mvc.model.Person;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends CrudRepository<Person, Long> {
}