package com.mphasis.serilization;

import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FilenameFilter;

public class Serilizationtest3 {
    public static void main(String args[]) {
        String dirname = "D:/java";
        File f1 = new File(dirname);
        FilenameFilter only = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith("HTML");
            }
        };
        try {
            String s[] = f1.list(only);

            for (int i = 0; i < s.length; i++) {
                System.out.println(s[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
