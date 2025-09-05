package com.estudo.arquivos.poo03.revisao.introducaometodos02.dominio;

import java.util.Scanner;

public class Calculadora {
    public void imprimir(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Digite outro número: ");
        double num2 = entrada.nextDouble();

        System.out.println("Escolha um operador (1 = (+), 2 = (-), 3 = (*), 4 = (/): ");
        int oparador = entrada.nextInt();

        switch (oparador){
            case 1 :
                System.out.println("Soma: " + (num1 + num2));
            case 2 :
                System.out.println("Subtração: " + (num1 - num2));
            case 3 :
                System.out.println("Multiplicação: " + (num1 * num2));
            case 4 :
                System.out.println("Divisão: " + (num1 / num2));
        }
    }
}
