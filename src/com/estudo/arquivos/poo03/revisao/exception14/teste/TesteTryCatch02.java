package com.estudo.arquivos.poo03.revisao.exception14.teste;

import java.io.File;
import java.io.IOException;

public class TesteTryCatch02 {
    public static void main(String[] args) throws IOException{
        criarArquivo();
    }

    public static void criarArquivo() throws IOException{
        File create = new File("Arquivo//teste.txt");
        try {
            boolean fileCreate = create.createNewFile();
            System.out.println("Arquivo criado: " + fileCreate);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }finally {
            System.out.println("Sistema encerrado.");
        }
    }
}
