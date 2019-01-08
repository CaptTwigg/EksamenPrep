package com.example.demo.OOP;

public class Main {

  public static void main(String[] args) {


    Student student = new Student("Ole",210,"KEA",3);

    System.out.println(student.school);
    System.out.println(student.getSemester());
    System.out.println(student.adult());

  }
}
