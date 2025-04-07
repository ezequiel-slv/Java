package com.estudo.arquivos.revisao.revisaopoo.metodos.dominio;

public class CalculadoraRev {
    public int divideDoisNumeros(int num1, int num2) {
        if (num1/num2 == 0){
            return 0;
        }
        return(num1/num2);
    }

    public int divideDoisNumeros02(int num1, int num2) {
        if (num2 != 0){
            return(num1/num2);
        }
        return 0;
    }

    public void divisaoDoisNumeros(int num1, int num2){
        if (num2 != 0){
            System.out.println(num1/num2);
            return;
        }
        System.out.println("Não existe divisão por zero");
    }

    public void imprimeValor(int numero1, int numero2){
        numero1 = 30;
        numero2 = 20;
        System.out.println("Dentro do dominio");
        System.out.println("num1: "+ numero1);
        System.out.println("num1: "+ numero2);
    }

    public void somaArrayVarargs (int ... numeros){
        System.out.println("Array com varargs");
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaArray (int[] numeros){
        System.out.println("Array normal");
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
