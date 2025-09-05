package com.estudo.arquivos.poo03.revisao.introducaometodos02.dominio;

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

    public void mediaVarArgs(double... notas){
        double soma = 0;
        for (double nota: notas){
            soma += nota;
        }

        double media = soma / notas.length;
        System.out.printf("Média: %.2f\n", media);
    }

    public void produtosValores(int... valores){
        int produto = 1;
        for (int valor: valores){
            produto *= valor;
        }
        System.out.println(produto);
    }

    public void listaNomes(String... nomes){
        for (String nome: nomes){
            System.out.println(nome);
        }
    }
}
