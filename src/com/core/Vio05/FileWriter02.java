package com.core.Vio05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter02 {
    public static void main(String[] args) {
        File file = new File("fileW.txt");

        try (FileWriter fileWriter = new FileWriter(file, true)){
            fileWriter.write("Esse é um teste com o fileWriter, para escrever um texto\nEssa é a segunda linha do meu texto");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
