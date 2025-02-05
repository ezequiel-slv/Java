package com.estudo.arquivos.poo.introducaometodos.test;

import com.estudo.arquivos.poo.introducaometodos.dominio.Calculadora;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros();
        System.out.println("Teste 1 soma finalizado");
        System.out.println("--------");
        calculadora.subDoisNumeros();
        System.out.println("Teste 2 subtração finalizado");
    }
}
