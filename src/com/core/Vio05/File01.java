package com.core.Vio05;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class File01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean newFile = file.createNewFile();
            System.out.println("File is created: " + newFile);

            boolean exists = file.exists();
            System.out.println("Is exists: " + file.exists());

            if (exists){
//                System.out.println("File is deleted: " + file.delete());
                System.out.println("File Path: " + file.getAbsolutePath());
                System.out.println("File hidden: " + file.isHidden());
                System.out.println("File can write: " + file.canWrite());
                System.out.println("File modified: " + new Date(file.lastModified()));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
