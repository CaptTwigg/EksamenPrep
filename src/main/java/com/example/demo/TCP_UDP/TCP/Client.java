package com.example.demo.TCP_UDP.TCP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

  public static void main(String[] args) throws IOException {
    BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
    String sentence;

    Socket clientSocket = new Socket("localhost", 5656);
    System.out.println("Connected to server");
    System.out.println("Begin typing");
    DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

    for(;;){
      sentence = inFromUser.readLine();
      outToServer.writeBytes(sentence + '\n');
    }



  }
}
