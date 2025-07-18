package com.estudo.arquivos.introducao.revisao.estruturaderepeticao04;

import java.util.Scanner;

public class EstDeRepForRevisao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        exe01();
        exe02(entrada);
        exe03();
        exe04();
        exe05();
        exe06();
        exe07(entrada);
        exe08(entrada);
        exe09(entrada);
        entrada.close();
    }

    public static void exe01(){
        for (int num = 0; num <= 70; num+= 7){
            System.out.println(num);
        }
    }

    public static void exe02(Scanner entrada){
        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        System.out.println("Escolha um operador (1 = +, 2 = -, 3 = *, 4 = /): ");
        int op = entrada.nextInt();

        for (int i = 1; i <= 10; i++){
            switch (op){
                case 1 :
                    System.out.println(i + " + " + num + " = " + (num + i));
                    break;
                case 2 :
                    System.out.println(i + " - " + num + " = " + (num - i));
                    break;
                case 3 :
                    System.out.println(i + " x " + num + " = " + (num * i));
                    break;
                case 4 :
                    System.out.println(i + " / " + num + " = " + ((double) num / i));
                    break;
                default:
                    System.out.println("Operador inválido");
                    return;
            }
        }
    }

    public static void exe03(){
        int num = 0;
        for (int i = 1; i <= 100; i++){
            num += i;
        }
        System.out.println(num);
    }

    public static void exe04(){
        for (char letra = 'a'; letra <= 'z'; letra++){
            System.out.println(letra);
        }
    }

    public static void exe05(){
        int a = 0;
        int b = 1;
        for (int i = 1; i <= 10; i++){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void exe06(){
        for (int i = 0; i <= 100; i+=2){
            System.out.println(i);
        }
    }

    public static void exe07(Scanner entrada){
        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        System.out.println("Escolha um operador: 1 = +, 2 = -, 3 = *, 4 = /: ");
        int op = entrada.nextInt();

        for (int i = 1; i <= 10; i++){
            switch (op){
                case 1 :
                    System.out.println(i + " + " + num + " = " + (i + num) );
                    break;
                case 2 :
                    System.out.println(i + " - " + num + " = " + (i - num) );
                    break;
                case 3 :
                    System.out.println(i + " x " + num + " = " + (i * num) );
                    break;
                case 4 :
                    System.out.println(i + " : " + num + " = " + (double) (i / num) );
                    break;
                default:
                    System.out.println("Número inválido!");
            }
        }
    }

    public static void exe08(Scanner entrada){
        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        int soma;
        int a = 0;
        for (int i = 0; i <= num; i++){
            soma = a += i;
            System.out.println(soma);
        }
    }

    public static void exe09(Scanner entrada){
        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        if (num < 0){
            System.out.println("Número inválido!");
            return;
        }

        int fatorial = 1;

        for (int i = num; i > 0; i--){
            fatorial *= i;

        }
        System.out.println(fatorial);
    }
}
