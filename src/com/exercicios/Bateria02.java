package com.exercicios;

import java.util.Scanner;

public class Bateria02 {
    public static void main(String[] args) {
//        CalculadoraSimples();
        MediaAritmetica();
    }
    public static void CalculadoraSimples(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite um número: ");
        int num2 = entrada.nextInt();

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));
        System.out.println("Divisão: " + (num1 / num2));
        System.out.println("Modulo: " + (num1 % num2));
    }

    public static void MediaAritmetica(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double num1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double num2 = entrada.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double num3 = entrada.nextDouble();

        double media = (num1 + num2 + num3) / 3;

        System.out.printf("Média: %.2f", media);
    }
}


