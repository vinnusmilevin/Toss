package com.mphasis.serilization;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Serilizationtest12 {


    public static int words = 0;
    public static int lines = 0;
    public static int chars = 0;

    public static void wc(InputStreamReader isr)
            throws IOException {
        int c = 0;
        boolean lastWhite = true;
        String whiteSpace = " \t\n\r";

        while ((c = isr.read()) != -1) {
            // Count characters
            chars++;
            // Count lines
            if (c == '\n') {
                lines++;
            }
            // Count words by detecting the start of a word
            int index = whiteSpace.indexOf(c);
            if(index == -1) {
                if(lastWhite == true) {
                    ++words;
                }
                lastWhite = false;
            }
            else {
                lastWhite = true;
            }
        }
        if(chars != 0) {
            ++lines;
        }
        System.out.println("ended"+lines+"==="+words);
    }

    public static void main(String args[]) {
        FileReader fr;
        try {
            System.out.println("enter args");
            if (args.length == 0) { // We're working with stdin
                wc(new InputStreamReader(System.in));
            }
            else { // We're working with a list of files
                for (int i = 0; i < args.length; i++) {
                    fr = new FileReader(args[i]);
                    wc(fr);
                }
            }
        }
        catch (IOException e) {
          //  return;
            System.out.println(e);
        }
        System.out.println(lines + " " + words + " " + chars);
    }
}
