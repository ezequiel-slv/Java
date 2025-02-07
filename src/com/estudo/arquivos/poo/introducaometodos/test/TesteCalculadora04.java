package com.estudo.arquivos.poo.introducaometodos.test;

import com.estudo.arquivos.poo.introducaometodos.dominio.Calculadora;

public class TesteCalculadora04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int num1 = 5;
        int num2 = 10;
        calculadora.variavelDominio(num1, num2);
        System.out.println("----------");
        System.out.println("Variavel copia teste04");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
