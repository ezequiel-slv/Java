package com.estudo.arquivos.introducao01.revisao.whille;

import java.util.Scanner;

public class EstDeRepWhileRevisao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //exe01();
        //exe02();
        //exe03(entrada);
        //exe04();
        //exe05();
        //exe06(entrada);
        //exe07(entrada);
        //exe08();
        exe09(entrada);
        entrada.close();
    }

    public static void exe01(){
        System.out.println("--------");
        int num = 0;
        while (num < 51){
            System.out.println(num);
            num++;
        }
    }

    public static void exe02(){
        System.out.println("--------");
        int num = 100;
        while (num > 0){
            System.out.println(num);
            num -= 10;
        }
    }

    public static void exe03(Scanner entrada){

        while (true){
            System.out.println("Digite um número: ");
            int num = entrada.nextInt();

            boolean numvalido = (num == 0);

            if (numvalido){
                System.out.println("Número válido");
                break;
            }
        }
    }

    public static void exe04(){
        int num = 5;
        int resultado = 1;
        while (num > 1){
            resultado *= num;
            num --;
        }
        System.out.println("Resultado: " + resultado);
    }

    public static void exe05(){
        int num = 1;
        while (num <= 30){
            if (num % 2 != 0){
                System.out.println(num);
            }
            num++;
        }
    }

    public static void exe06(Scanner entrada){
        int numero; int soma = 0;
        System.out.println("Número um número: ");
        numero = entrada.nextInt();

        while (numero != 0){
            soma += numero;
            System.out.println("Digite outro número: ");
            numero = entrada.nextInt();
        }
        System.out.println(soma);
    }

    public static void exe07(Scanner entrada){

        while (true){
            System.out.println("Digite a senha: ");
            String senha = entrada.nextLine();

            boolean senhaCorreta = senha.equals("123");

            if (senhaCorreta){
                System.out.println("Senha correta!");
                break;
            }else {
                System.out.println("Senha inválida! Tente novamente.");
            }
        }
    }

    public static void exe08(){
        int num = 0;

        while (num < 100){
            num++;
            System.out.println(num);
        }
    }

    public static void exe09(Scanner entrada){
        int numero;
        int soma = 0;

        System.out.println("Digite um número (negativo para sair): ");
        numero = entrada.nextInt();

        while (numero >= 0){
            soma += numero;

            System.out.println("Digite outro número: (negativo para sair): ");
            numero = entrada.nextInt();
        }

        System.out.println("Números somados: " + soma);
    }
}

