package com.mphasis.serilization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Serilization {
    public static void main(String args[]) throws IOException {
        FileReader fr = new FileReader("FileInputStreamDemo.java");
        BufferedReader br = new BufferedReader(fr);
        String s;

        while((s = br.readLine()) != null) {
            System.out.println(s);
        }

        fr.close();
    }

}
