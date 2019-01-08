package com.example.demo.spring.mvc.controller;

import com.example.demo.spring.mvc.view.PersonRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class API {

  @Autowired
  PersonRepo personRepo;

  @GetMapping("api/persons")
  public ResponseEntity persons(){
    ArrayList persons = (ArrayList) personRepo.findAll();

    return new ResponseEntity<>(persons, HttpStatus.OK);
  }
}
