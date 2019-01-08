package com.example.demo.Threads;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws Exception {
    MyThreadEx myThreadEx = new MyThreadEx();
    MyThreadIm myThreadIm = new MyThreadIm();

    //threadM();
    //myThreadEx.start();
   // scannerRun();

    Thread thread = new Thread(myThreadIm);
    thread.start();

  }

  public static void threadM(){
    Thread thread = new Thread(() -> {
      int i = 0;
      for (; ; ) {
        System.out.println(i);
        i++;

        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });
    thread.start();
  }
  public  static void scannerRun(){
    Scanner scanner = new Scanner(System.in);

    for(;;){
      System.out.println( scanner.next());
    }
  }
}
