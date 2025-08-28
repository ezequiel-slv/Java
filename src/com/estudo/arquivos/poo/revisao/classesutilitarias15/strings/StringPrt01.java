package com.estudo.arquivos.poo.revisao.classesutilitarias15.strings;

public class StringPrt01 {
    public static void main(String[] args) {
        String nome = "Ezequiel";
        String nome2 = "Ezequiel";
        String nome3 = nome.concat(" Silva");
        String nome4 = new String("Ezequiel");

        System.out.println("nome: " + nome);
        System.out.println("nome2: " + nome2);
        System.out.println("nome3: " + nome3);
        System.out.println("nome4: " + nome4);

        boolean cond1 = nome == nome2;
        System.out.println("nome == nome2: " + cond1);

        System.out.println("-----");

        System.out.println("nome + Silva: " + nome3);

        System.out.println("-----");

        boolean cond2 = nome == nome3;
        System.out.println("nome == nome3: " + cond2);

        System.out.println("-----");

        boolean cond3 = nome == nome4;
        System.out.println("nome == nome4: " + cond3);
    }
}
