package com.estudo.arquivos.poo03.revisao.modificadordeacesso03.teste;

import com.estudo.arquivos.poo03.revisao.modificadordeacesso03.dominio.Calculadora2;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora2 calculadora2 = new Calculadora2();
        //calculadora2.Somar(5, 5);
        //calculadora2.Somar(5, 5, 5);
        calculadora2.Somar(5, 5, 5, 2.5, 8.5);
        calculadora2.imprime();
    }
}
