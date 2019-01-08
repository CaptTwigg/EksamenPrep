package com.example.demo.spring.mvc.controller;

import com.example.demo.spring.mvc.model.Person;
import com.example.demo.spring.mvc.model.PersonRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@org.springframework.stereotype.Controller
public class Controller {
  @Autowired
  PersonRepo personRepo;

  @GetMapping("jpa")
  public String main(Model model){
    personRepo.save(new Person("Ole", "1234"));
    personRepo.save(new Person("Sven", "1234"));
    personRepo.save(new Person("Hansen", "1234"));
    ArrayList persons = (ArrayList) personRepo.findAll();
    model.addAttribute("persons",persons );
    System.out.println(personRepo.findAll());
    return "index";
  }
}
