package com.example.demo.TCP_UDP.TCP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
  public static void main(String[] args) throws Exception {
    System.out.println("Starting server");
    ServerSocket welcomeSocket = new ServerSocket(5656);

    Socket connectionSocket = welcomeSocket.accept();
    System.out.println("New client connected to port: " + connectionSocket.getPort());

    for(;;){
      BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
      System.out.println("Client send: " + inFromClient.readLine());

    }


  }
}
