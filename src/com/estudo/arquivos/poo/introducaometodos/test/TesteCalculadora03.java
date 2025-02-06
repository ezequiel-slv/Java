package com.estudo.arquivos.poo.introducaometodos.test;

import com.estudo.arquivos.poo.introducaometodos.dominio.Calculadora;

public class TesteCalculadora03 {
    public static void main(String[] args) {
       Calculadora calculadora = new Calculadora();

       int result = calculadora.divDoisNumeros(6, 2);
        System.out.println(result);
    }
}
