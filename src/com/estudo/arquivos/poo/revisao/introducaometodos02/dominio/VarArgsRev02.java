package com.estudo.arquivos.poo.revisao.introducaometodos02.dominio;

public class VarArgsRev02 {

    public void somaVarArgs(int...numeros){
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println("Soma: " + soma);
    }

    public void subVarArgs(int...numeros){
        int sub = 1000;
        for (int numero : numeros){
            sub -= numero;
        }
        System.out.println("Subtração: " + sub);
    }
}
