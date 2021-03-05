package com.mphasis.serilization;

import java.io.*;

public class Serilizationtest5 {
    public static void main(String args[]) {
        String source = "Now is the time for all good men\n"
                + " to come to the aid of their country\n"
                + " and pay their due taxes.";
        byte buf[] = source.getBytes();
        OutputStream f0 = null;
        try {
            f0 = new FileOutputStream("filenew.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < buf.length; i += 2) {
            try {
                f0.write(buf[i]);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            f0.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
     try{

        OutputStream f1 = new FileOutputStream("file2.txt");
        f1.write(buf);
        f1.close();

        OutputStream f2 = new FileOutputStream("file3.txt");
        f2.write(buf,buf.length-buf.length/4,buf.length/4);
        f2.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
        System.out.println("Succesfully written");
    }

}
