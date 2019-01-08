package com.example.demo.Threads;

public class MyThreadEx extends Thread {

  @Override
  public void run() {
    int i = 10000000;
    for (; ; ) {
      System.out.println(i);
      i--;

      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
