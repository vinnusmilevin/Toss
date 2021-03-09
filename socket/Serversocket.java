package com.mphasis.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Serversocket {
    public static void main(String[] args) {
        ServerSocket s= null;
        try {
            s = new ServerSocket(8888);

           while(true) {
               Socket client=s.accept();
               System.out.println("client connected");

               OutputStream os = client.getOutputStream();
               PrintWriter data = new PrintWriter(os);
               data.write("hello from server");

               System.out.println("out->");
               data.flush();
os.close();
           }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
