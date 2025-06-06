package com.estudo.arquivos.poo.classesutilitarias.strings;

public class StringBuilder {
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
        java.lang.StringBuilder nome = new java.lang.StringBuilder("Ezy");
        nome.append(" Slv");

        nome.reverse();
        nome.reverse();
        String sub = nome.substring(0,2);
        nome.delete(0,1);
        System.out.println(nome);
        System.out.println(sub);



    }

}
