package com.revisao.arquivos.poo02.modificadordeacesso03.teste;

import com.revisao.arquivos.poo02.modificadordeacesso03.dominio.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaInt(1, 2);
        System.out.println("-----");
        calculadora.somaInt(1, 2, 3);
    }
}
