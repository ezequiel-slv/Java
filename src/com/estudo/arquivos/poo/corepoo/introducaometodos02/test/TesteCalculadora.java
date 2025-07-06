package com.estudo.arquivos.poo.corepoo.introducaometodos02.test;

import com.estudo.arquivos.poo.corepoo.introducaometodos02.dominio.Calculadora;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Soma dois números");
        calculadora.somaDoisNumeros();

        System.out.println("Subtrai dois números");
        calculadora.subDoisNumeros();

        System.out.println("multiplica dois números");
        calculadora.multDoisNumeros(40, 3);

        System.out.println("Divide dois números");
        calculadora.divDoisNumeros(20, 5);

        System.out.println("Divide dois números 2 forma");
        calculadora.divDoisNumerosTipoDois(8, 4);

        System.out.println("Divide dois números 3 forma");
        calculadora.divDoisNumerosTipoTres(30, 6);

        System.out.println("Variavel do dominio");
        calculadora.variavelDominio(8, 4);

        System.out.println("Soma Array metodo normal");
        int[] numeros = {1,2,3,4,5,6};
        calculadora.somaArray(numeros);

        System.out.println("Soma Array utilizando Varargs");
        calculadora.ArrayVarArgs(1,2,3,4,5,6);

    }
}
