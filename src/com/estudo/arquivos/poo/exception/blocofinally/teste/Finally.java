package com.estudo.arquivos.poo.exception.blocofinally.teste;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        calculadora(entrada);

    }

    public static void calculadora(Scanner entrada){

        System.out.println("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite o segundo número");
        int num2 = entrada.nextInt();

        try (entrada) {
            int resultado = num1 / num2;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            throw new RuntimeException("Erro: divisor igual a zero");
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}
