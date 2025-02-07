package com.estudo.arquivos.poo.introducaometodos.test;

import com.estudo.arquivos.poo.introducaometodos.dominio.Calculadora;

public class TesteCalculadora03 {
    public static void main(String[] args) {
       Calculadora calculadora = new Calculadora();

       int result = calculadora.divDoisNumeros(6, 2);
        System.out.println(result);
        System.out.println("----------");
        int resultDois = calculadora.divDoisNumerosTipoDois(10, 0);
        System.out.println(resultDois);
        System.out.println("----------");
        calculadora.divDoisNumerosTipoTres(10, 0);
    }
}
