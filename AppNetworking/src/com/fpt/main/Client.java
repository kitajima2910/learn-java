/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.main;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Lan-T
 */
public class Client {
    
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6969);
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            System.out.println("Message received from Server: " + dis.readUTF());
            socket.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
