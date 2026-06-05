package com.revisao.arquivos.introducao01.estruturasderepeticao04;

import java.util.Scanner;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
//        exe01();
//        exe02();
//        exe03();
        exe04();
    }

    public static void exe01(){
        /*
        Exercício 1 Crie um programa que imprima apenas os números pares de 0 a 20 utilizando while.

        Requisitos técnicos:

        Inicialize a variável fora do laço.

        Controle o incremento manualmente.

        Utilize operador %.
         */

        System.out.println("1)---");

        int num = 0;

        while (num < 20){
            num++;
            if (num % 2 == 0){
                System.out.println(num);
            }
        }

        System.out.println("2)---");
        /*
        Exercício 2

        Faça um programa que calcule a soma dos números de 1 a 100 usando while.
         */

        int num2 = 1;
        int soma = 0;

        while (num2 <= 100){
            soma += num2;
            num2++;
        }

        System.out.println(soma);
    }

    public static void exe02(){
        /*
        Exercício 1

        Implemente um programa que:

        Peça um número ao usuário. Continue pedindo enquanto o número for negativo.
        Quando o usuário digitar um número válido (≥ 0), exiba:
         */

        System.out.println("1)---");

        Scanner entrada = new Scanner(System.in);
        int val;

        do {
            System.out.println("Digite um numero: ");
            val =  entrada.nextInt();
        }while (val <= 0);

        System.out.println("Número valido");


        /*
        Exercício 2

        Simule um sistema simples de senha:

        A senha correta é 1234.
        Enquanto a senha digitada for diferente, mostre:
         */

        System.out.println("2)----");

        Scanner senha = new Scanner(System.in);
        String num;

        do {
            System.out.println("Digite uma senha: ");
                num =  senha.nextLine();
        }while (!num.equals("1234"));

        System.out.println("Senha valida");
        senha.close();
    }

    public static void exe03(){
        /*
        Exercício 1

        Imprima a tabuada do 7 (de 1 até 10) utilizando for.
         */

        System.out.println("1)---");

        int num = 7;

        for (int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i  + ": " + (num * i));
        }


        /*
        Exercício 2

        Utilizando for, imprima os números de 100 até 0 em ordem decrescente, decrementando de 5 em 5.
         */
        System.out.println("2)---");

        for (int num2 = 100; num2 >= 0; num2-=5){
            System.out.println(num2);
        }
    }

    public static void exe04(){
        /*
        Exercício 1

        Percorra os números de 1 a 100 usando for.

        Quando encontrar o primeiro número múltiplo de 17, interrompa o laço usando break.

        Imprima o número encontrado.
         */

        System.out.println("1)---");

            for (int i = 1; i <= 100; i++){
                if (i % 17 == 0){
                    System.out.println(i);
                    break;
                }
            }

        /*
        Exercício 2

        Crie um programa que percorra números de 1 a 50.

        Se encontrar um número divisível por 9 e por 3 ao mesmo tempo, interrompa a execução.

        Mostre qual número causou a interrupção.
         */

        System.out.println("2)---");

        for (int a = 1; a <= 50; a++){
            if (a % 3 == 0 && a % 9 == 0){
                System.out.println(a);
                break;
            }
        }
    }
}
