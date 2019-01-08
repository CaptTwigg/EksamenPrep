package com.example.demo.pattern;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Iterator {

  public static void main(String[] args) throws FileNotFoundException {
    Scanner scanner = new Scanner(new File("src\\main\\java\\com\\example\\demo\\pattern\\file.txt"));

    StringBuilder stringBuilder = new StringBuilder();
    while (scanner.hasNext()) {
      stringBuilder.append(scanner.next());
      stringBuilder.append(" ");
    }

    System.out.println(stringBuilder);
  }
}
