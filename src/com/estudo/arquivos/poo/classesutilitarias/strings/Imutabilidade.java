package com.estudo.arquivos.poo.classesutilitarias.strings;

public class Imutabilidade {
    public static void main(String[] args) {
        String nome = "Ezequiel";
        String nome2 = "Ezequiel";

        // Tanto a referência nome e nome2 vão apontar para a mesma String


        nome.concat(" Silva"); // Jeito errado
        nome = nome.concat(" Silva"); // Agora o nome vai apontar para o novo valor (nome + sobrenome)
        System.out.println(nome);
        System.out.println(nome.equals(nome2));
    }
}
