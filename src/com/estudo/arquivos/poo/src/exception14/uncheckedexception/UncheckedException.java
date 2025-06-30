package com.estudo.arquivos.poo.src.exception14.uncheckedexception;

public class UncheckedException {
    public static void main(String[] args) {
        System.out.println(divisao(8, 2));

    }

    public static int divisao(int num1, int num2){
        if (num2 == 0){
            throw new IllegalArgumentException("Divisor não pode ser zero");
        }
        return num1 / num2;
    }
}
