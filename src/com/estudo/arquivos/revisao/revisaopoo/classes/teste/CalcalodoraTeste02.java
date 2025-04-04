package com.estudo.arquivos.revisao.revisaopoo.classes.teste;

import com.estudo.arquivos.revisao.revisaopoo.metodos.dominio.CalculadoraRev;

public class CalcalodoraTeste02 {
    public static void main(String[] args) {
        CalculadoraRev calculadora = new CalculadoraRev();
        System.out.println("Dentro do teste");
        int a = 1;
        int b = 2;
        System.out.println("num1: "+ a);
        System.out.println("num2: "+ b);
        calculadora.imprimeValor(a, b);
    }
}
