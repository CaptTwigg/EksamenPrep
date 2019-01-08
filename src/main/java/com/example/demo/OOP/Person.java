package com.example.demo.OOP;

public abstract class Person  implements PersonFace{

  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String adult(){
    if(age > 18)
      return "Adult";
    return "Child";
  }

}
