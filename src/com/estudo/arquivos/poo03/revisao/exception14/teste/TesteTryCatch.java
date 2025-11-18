package com.estudo.arquivos.poo03.revisao.exception14.teste;

import java.io.File;
import java.io.IOException;

public class TesteTryCatch {
    public static void main(String[] args) {
        criarArquivo();
        divisao(4, 0);
    }

    public static void criarArquivo(){
        File create = new File("Arquivo//teste.txt");
        try {
            boolean fileCreate = create.createNewFile();
            System.out.println("Arquivo criado: " + fileCreate);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int divisao(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Não existe divisão por zero");
        }
        return a/b;
    }
}
