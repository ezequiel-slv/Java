package com.estudo.arquivos.introducao01.revisao.estruturaderepeticao04;

import java.util.Scanner;

public class EstDeRepDoWhileRevisao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //exe01(entrada);
        //exe02(entrada);
        //exe03(entrada);
        //exe04(entrada);
        //exe05(entrada);
        //exe06(entrada);
        //exe07(entrada);
        //exe08(entrada);
        exe09(entrada);
        entrada.close();
    }

    public static void exe01(Scanner entrada){
        do {
            System.out.println("Digite a senha: ");
            String senha = entrada.nextLine();

            boolean condicao = senha.equals("java123");

            if (condicao){
                System.out.println("Senha correta");
                break;
            }
        }while (true);
    }

    public static void exe02(Scanner entrada){
        do {
            System.out.println("Digite um número positivo: ");
            double num = entrada.nextDouble();

            boolean condicao = num > 0;

            if (condicao){
                System.out.println("Número válido");
                break;
            }else{
                System.out.println("Número inválido! Tente novamente");
            }
        }while (true);
    }

    public static void exe03(Scanner entrada){

        do {
            System.out.println("Clique 1 para ver o perfil: ");
            int ver = entrada.nextInt();

            System.out.println("Clique 2 para editar o perfil: ");
            int editar = entrada.nextInt();

            System.out.println("Clique 0 para sair do perfil: ");
            int sair = entrada.nextInt();

            boolean condicaoVerPerfil = ver == 1;

            boolean condicaoEditarPerfil = editar == 2;

            boolean condicaoSairPerfil = sair == 0;

            if (condicaoVerPerfil){
                if (condicaoEditarPerfil){
                    if (condicaoSairPerfil){
                        return;
                    }
                }
            }else {
                System.out.println();
            }
        }while (true);
    }

    public static void exe04(Scanner entrada){
        do {
            System.out.println("Digite a primeira nota: ");
            double nota1 = entrada.nextDouble();

            System.out.println("Digite a segunda nota: ");
            double nota2 = entrada.nextDouble();

            System.out.println("Digite a terceira nota: ");
            double nota3 = entrada.nextDouble();

            boolean condNota1 = nota1 >= 0 && nota1 <=10;
            boolean condNota2 = nota2 >= 0 && nota2 <=10;
            boolean condNota3 = nota3 >= 0 && nota3 <=10;

            double media = (nota1 + nota2 + nota3) / 3;

            if (condNota1){
                if (condNota2){
                    if (condNota3){
                        System.out.printf("Média: %.1f\n", media);
                        break;
                    }else{
                        System.out.println("Número inválido");
                    }
                }else{
                    System.out.println("Número inválido");
                }
            }else{
                System.out.println("Número inválido");
            }
        }while (true);
    }

    public static void exe05(Scanner entrada){
        do {
            System.out.println("Digite 1 para startar: ");
            int start = entrada.nextInt();

            boolean condicao = start == 1;

            if (condicao){
                System.out.println("Olá mundo!");
                System.out.println("Olá mundo!");
                System.out.println("Olá mundo!");
                System.out.println("Olá mundo!");
                System.out.println("Olá mundo!");
                break;
            }
        }while (true);
    }

    public static void exe06(Scanner entrada){

        do {
            System.out.println("1-Olá");
            System.out.println("2-Ajuda");
            System.out.println("0-Sair");
            System.out.println("------");
            System.out.println("Escolha uma opção: ");
            int escolha = entrada.nextInt();

            boolean condicao1 = escolha == 1;
            boolean condicao2 = escolha == 2;
            boolean condicao0 = escolha == 0;

            if (condicao1){
                System.out.println("Olá");
            } else if (condicao2) {
                System.out.println("Que ajuda você quer?");
            } else if (condicao0) {
                System.out.println("Programa encerrado");
                break;
            }else {
                System.out.println("Número inválido");
            }
        }while (true);
    }

    public static void exe07(Scanner entrada){

        do {
            System.out.println("Digite um número positivo: ");
            int num = entrada.nextInt();

            boolean condicao = num >= 0;

            if (condicao){
                System.out.println("Valor válido!");
                break;
            }else {
                System.out.println("Valor inválido!");
            }
        }while (true);
    }

    public static void exe08(Scanner entrada){

        do {
            System.out.println("Digite a senha: ");
            String senha = entrada.nextLine();

            boolean condicao = senha.equals("java123");

            if (condicao){
                System.out.println("Senha correta!");
                break;
            }else {
                System.out.println("Senha incorreta! Tente novamente.");
            }

        }while (true);
    }

    public static void exe09(Scanner entrada){

        do {
            System.out.println("Escolha : 1-Opção A, 2-Opção B, 3-Sair: ");
            int menu = entrada .nextInt();

            boolean condicao1 = menu == 1;
            boolean condicao2 = menu == 2;
            boolean condicao3 = menu == 3;

            if (condicao1){
                System.out.println("Opção A");
            } else if (condicao2){
                System.out.println("Opção B");
            }else if (condicao3){
                System.out.println("Programa finalizado!");
                break;
            }else {
                System.out.println("Número inválido!");
            }
        }while (true);
    }
}