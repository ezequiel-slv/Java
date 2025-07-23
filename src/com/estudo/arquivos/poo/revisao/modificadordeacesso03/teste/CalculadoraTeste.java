package com.estudo.arquivos.poo.revisao.modificadordeacesso03.teste;

import com.estudo.arquivos.poo.revisao.modificadordeacesso03.dominio.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] somaDoisNumInt = {2,2};
        int[] somaTresNumInt = {2,5,4};
        double[] somaDoisNumDouble = {3.2, 5.3};
        calculadora.somar(somaDoisNumInt);
        calculadora.somar(somaDoisNumInt, somaTresNumInt);
        calculadora.somar(somaDoisNumInt, somaTresNumInt, somaDoisNumDouble);

    }
}
