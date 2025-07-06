package com.estudo.arquivos.introducao.revisao.estruturaderepeticao04;

import java.util.Scanner;

public class EstDeRepWhileRevisao {
    public static void main(String[] args) {
        exe01();
        exe02();
        exe03();
        exe04();
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

    public static void exe03(){
        Scanner entrada = new Scanner(System.in);

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
}
