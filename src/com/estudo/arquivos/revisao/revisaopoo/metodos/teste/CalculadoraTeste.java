package com.estudo.arquivos.revisao.revisaopoo.metodos.teste;

import com.estudo.arquivos.revisao.revisaopoo.metodos.dominio.CalculadoraRev;

public class CalculadoraTeste {
    public static void main(String[] args) {
        CalculadoraRev calculadora = new CalculadoraRev();
        System.out.println("Metodo com retorno");
        int result = calculadora.divideDoisNumeros(20,4);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros(40,4));
        System.out.println("---------");
        System.out.println("Metodo sem retorno");
        calculadora.divisaoDoisNumeros(100,2);
    }
}
