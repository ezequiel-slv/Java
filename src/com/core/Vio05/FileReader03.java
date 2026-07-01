package com.core.Vio05;

import java.io.File;
import java.io.FileReader;

public class FileReader03 {
    public static void main(String[] args) {
        File file = new File("fileW.txt");
        try(FileReader fr = new FileReader(file)){
//
//            char[] in = new char[60];
//            int size = fr.read();
//
//            System.out.println(size);
//
//            for (char c : in){
//                System.out.println(c);
//            }

            int i;
            while ((i=fr.read()) != -1){
                System.out.print((char)i);
            }

        }catch (Exception e){
            e.getStackTrace();
        }

    }
}
