package com.example.demo.spring.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  @Column(name = "verynicename")
  private String name;
  private String password;


  public Person() {
  }

  public Person(String name, String password) {
    this.name = name;
    this.password = password;
  }

  @Override
  public String toString() {
    return String.format("id: %s name: %s password: %s "
      , this.id, this.name, this.password);
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password =password;
  }


}
