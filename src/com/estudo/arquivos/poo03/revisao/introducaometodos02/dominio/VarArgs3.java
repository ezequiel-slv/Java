package com.estudo.arquivos.poo03.revisao.introducaometodos02.dominio;

public class VarArgs3 {
    public void somaVarArgs(int ... numeros){
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println("Soma: " + soma);
    }

    public void subVarArgs(int... numeros){
        int sub = 1000;
        for (int numero : numeros) {
            sub -= numero;
        }
        System.out.println("Subtração: " + sub);
    }

    public void multVarArgs(int... numeros){
        int mult = 2;
        for (int numero : numeros) {
            mult *= numero;
        }
        System.out.println("Multiplicação: " + mult);
    }

    public void divVarArgs(int... numeros){

        double resultado = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            resultado /= numeros[i];
        }
        System.out.printf("Divisão: %.2f\n" , resultado);
    }
}
