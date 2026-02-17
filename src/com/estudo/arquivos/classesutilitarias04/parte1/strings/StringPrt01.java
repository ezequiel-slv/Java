package com.estudo.arquivos.classesutilitarias04.parte1.strings;

public class StringPrt01 {
    public static void main(String[] args) {
        String nome = "Ezequiel";
        String nome2 = "Ezequiel";
        // Tanto a referência nome e nome2 vão apontar para a mesma String

        nome.concat(" Silva"); // Jeito errado
        nome = nome.concat(" Silva"); // Agora o nome vai apontar para o novo valor (nome + sobrenome)
        String nome3 = new String("Ezequiel"); //String encapsulada
        System.out.println(nome);
        System.out.println(nome.equals(nome2));
        System.out.println(nome == nome3.intern());
    }
}
