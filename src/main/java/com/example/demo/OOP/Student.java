package com.example.demo.OOP;

public class Student  extends Person {


  String school;
  private int semester;


  public Student(String name, int age, String school, int semester) {
    super(name, age);
    this.school = school;
    this.semester = semester;
  }


  public int getSemester() {
    return semester;
  }

  public void setSemester(int semester) {
    this.semester = semester;
  }

  @Override
  public String toString() {
    return String.format("school: %s semester: %s "
      , this.school, this.semester);
  }
}
