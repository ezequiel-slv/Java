package com.estudo.arquivos.exception04.coreexception.catchwithresorces.teste;

import java.io.*;

public class Texto1 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo(){
        Reader reader = null;

        try {
            reader = new BufferedReader(new FileReader("arquivo.txt"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null){
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Erro: IOException");
            }
        }
    }
}
