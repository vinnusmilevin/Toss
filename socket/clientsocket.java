package com.mphasis.socket;

import java.io.*;
import java.net.Socket;

public class clientsocket {
    public static void main(String[] args) {
        try {
            Socket so=new Socket("127.0.0.1",8888);

            System.out.println("connected");
         InputStream in= so.getInputStream();
            BufferedReader din=new BufferedReader(new InputStreamReader(in));
          String str= din.readLine();
            System.out.println(str);

            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
