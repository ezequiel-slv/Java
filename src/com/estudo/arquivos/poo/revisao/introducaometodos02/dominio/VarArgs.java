package com.estudo.arquivos.poo.revisao.introducaometodos02.dominio;

public class VarArgs {

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println("Array normal: " + soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num: numeros){
            soma += num;
        }
        System.out.println("Array com VarArgs: " + soma);
    }
}
