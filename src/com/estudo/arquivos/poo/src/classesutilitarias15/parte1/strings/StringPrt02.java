package com.estudo.arquivos.poo.src.classesutilitarias15.parte1.strings;

public class StringPrt02 {
    public static void main(String[] args) {
        String nome = "Ezequiel";
        String num = "0123456";


        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.length());
        System.out.println(nome.replace('e', 'E'));
        System.out.println(nome.trim());
        System.out.println(num.charAt(1));
        System.out.println(num.substring(0, 7));

    }
}
