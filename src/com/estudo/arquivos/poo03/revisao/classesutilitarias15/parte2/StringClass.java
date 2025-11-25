package com.estudo.arquivos.poo03.revisao.classesutilitarias15.parte2;

public class StringClass {
    public static void main(String[] args) {
        String nome = "Ezequiel";
        String nome2 = "Ezequiel";

        nome = nome.concat(" Silva Lima");
        System.out.println(nome);

        System.out.println("------");

        System.out.println(nome == nome2);

        System.out.println("------");

        String nome3 = new String("Ezequiel");
        System.out.println(nome2 == nome3);
    }
}
