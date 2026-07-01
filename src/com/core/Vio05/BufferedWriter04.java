package com.core.Vio05;

import java.io.*;

public class BufferedWriter04 {
    public static void main(String[] args) {

        File file = new File("file.txt");

        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter br = new BufferedWriter(fw)) {
            br.write("Esse é um teste com o BufferedWriter, para escrever um texto\nEssa é a segunda linha do meu texto");
            br.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
