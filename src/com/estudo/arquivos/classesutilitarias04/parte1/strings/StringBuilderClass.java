package com.estudo.arquivos.classesutilitarias04.parte1.strings;

public class StringBuilderClass {
    public static void main(String[] args) {
        String();
        StringBuilder02();
    }

    public static void String(){
        String nome = "Ezequiel";
        nome = nome.concat(" Silva");
        System.out.println(nome);
    }

    public static void StringBuilder02(){
        StringBuilder nome = new StringBuilder("Ezy");
        nome.append("Slv");

        nome.reverse();
        nome.reverse();
        String sub = nome.substring(0,3);
        nome.delete(0,3);
        System.out.println(sub);
        System.out.println(nome);
    }

}
