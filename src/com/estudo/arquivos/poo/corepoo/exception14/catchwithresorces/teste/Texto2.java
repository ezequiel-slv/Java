package com.estudo.arquivos.poo.corepoo.exception14.catchwithresorces.teste;

import com.estudo.arquivos.poo.corepoo.exception14.catchwithresorces.dominio.Leitor1;
import com.estudo.arquivos.poo.corepoo.exception14.catchwithresorces.dominio.Leitor2;

import java.io.*;

public class Texto2 {

    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo(){

        try (Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){
            System.out.println("Erro: IOException");
        }

    }
}
