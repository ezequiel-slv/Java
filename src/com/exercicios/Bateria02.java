package com.exercicios;

import java.util.Scanner;

public class Bateria02 {
    public static void main(String[] args) {
//        CalculadoraSimples01();
//        MediaAritmetica02();
        AreaRetangulo03();

    }
    public static void CalculadoraSimples01(){
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

    public static void MediaAritmetica02(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite a segunda nota: ");
        int num2 = entrada.nextInt();

        System.out.println("Digite a terceira nota: ");
        int num3 = entrada.nextInt();

        double media = (num1 + num2 + num3) / 3.0;

        System.out.printf("Média: %.2f", media);
    }

    public static void AreaRetangulo03() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite a largura: ");
        double largura = scanner.nextDouble();

        double area = altura * largura;

        System.out.println("Área de um retangulo: " + area);
    }
}


