package com.estudo.arquivos.poo.corepoo.exception14.tratamento;

import java.io.File;
import java.io.IOException;

public class TryCatch {
    public static void main(String[] args) {
        criandoArquivo();
    }

    public static void criandoArquivo(){
        File file = new File("arquivo" + File.separator +"file.txt");

        try{
            boolean isCreat = file.createNewFile();
            System.out.println("Arquivo criado: " + isCreat);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
