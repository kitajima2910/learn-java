package com.fpt.main;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lan-T
 */
public class Server extends Thread {

    private ServerSocket serverSocket;
    private int port;

    public Server() {
    }

    public Server(int port) {
        this.port = port;
    }

    @Override
    public void run() {
        while (true) {
            try {
                serverSocket = new ServerSocket(port);
                System.out.println("Listening for Client message on port " + serverSocket.getLocalPort());
                Socket socket = serverSocket.accept();
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                dos.writeUTF("Hello from Server!!!");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Thread t = new Server(6969);
        t.start();
    }
}
