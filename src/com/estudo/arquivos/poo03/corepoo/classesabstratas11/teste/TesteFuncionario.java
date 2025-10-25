package com.estudo.arquivos.poo03.corepoo.classesabstratas11.teste;

import com.estudo.arquivos.poo03.corepoo.classesabstratas11.dominio.Desenvolvedor;
import com.estudo.arquivos.poo03.corepoo.classesabstratas11.dominio.Hacker;

public class TesteFuncionario {
    public static void main(String[] args) {

        Desenvolvedor desenvolvedor = new Desenvolvedor("Ezequiel", "Java", 10000);
        System.out.println(desenvolvedor);

        Hacker hacker = new Hacker("Ezequiel", "Python", "Gray hat", 6000);
        System.out.println(hacker);
    }
}
