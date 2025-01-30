package com.estudo.arquivos.revisao;

public class Revisao02Operadores {
    public static void main(String[] args) {
        
        int x = 15;
        int y = 5;

        int multiplicacao = x * y;
        int adicao = x + y;
        int subtracao = x - y;
        int divisao = x / y;
        int resto = x % y;

        var resultado = ("x . y = "+ multiplicacao + " x + y = "+ adicao + " x - y = "+ subtracao + " x : y = "+ divisao+ " x % y = " + resto);

        boolean isXMaiorqueY = x > y;
        boolean isXIgualqueY = x == y;
        System.out.println("X é maior que y? "+ isXMaiorqueY);
        System.out.println("X é igual a y? "+ isXIgualqueY);

        boolean condioes1 = x > 10 && y < 10;
        boolean condioes2 = x == 15 || y == 15;
        System.out.println("X é maior que 10 e y é menor que 10? "+condioes1);
        System.out.println("X igual a 15 ou y é igual 15? "+condioes2);

        int z = 50;
        z += 10;
        z *= 2;
        System.out.println(z);

        int idade = 25;
        idade ++;
        idade --;
        System.out.println(idade);

    }
}
