package com.estudo.arquivos.revisao.revisaopoo.metodos.teste;

import com.estudo.arquivos.revisao.revisaopoo.metodos.dominio.CalculadoraRev;

public class CalculadoraTeste {
    public static void main(String[] args) {
        CalculadoraRev calculadora = new CalculadoraRev();
        int result = calculadora.divideDoisNumeros(20,4);
        System.out.println(result);
    }
}
