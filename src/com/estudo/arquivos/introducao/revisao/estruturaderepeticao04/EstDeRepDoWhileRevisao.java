package com.estudo.arquivos.introducao.revisao.estruturaderepeticao04;

import java.util.Scanner;

public class EstDeRepDoWhileRevisao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        exe01(entrada);
        exe02(entrada);
        exe03(entrada);
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
}