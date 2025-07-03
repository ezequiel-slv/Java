package com.estudo.arquivos.introducao.revisao.estruturascondicionais03;

import java.util.Scanner;

public class EstruturasCondicionaisRevisao {
    public static void main(String[] args) {
        Exe01();
        Exe02();
        Exe03();
        Exe04();
        Exe05();
        Exe06();
        Exe07();
        Exe08();
    }

    public static void Exe01(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma idade: ");
        int idade = entrada.nextInt();

        boolean condicao = idade < 18;

        if (condicao){
            System.out.println("Não é permitido dirigir");
        }
        if (!condicao){
            System.out.println("Permitido dirigir");
        }
    }

    public static void Exe02(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = entrada.nextDouble();

        boolean condicao = num < 0;

        if (condicao){
            System.out.println("O número é negativo");
        }
        if (!condicao){
            System.out.println("O número não é negativo");
        }
    }

    public static void Exe03(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = entrada.nextDouble();

        if (num > 0){
            System.out.println("Positivo: ");
        } else if (num < 0) {
            System.out.println("Negativo");
        }else{
            System.out.println("Igual a zero");
        }
    }

    public static void Exe04(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double n2 = entrada.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double n3 = entrada.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        if (media < 5){
            System.out.println("Reprovado");
        } else if (media >= 5 && media <=7){
            System.out.println("Recuperação");
        }else{
            System.out.println("Aprovado");
        }
    }

    public static void Exe05(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        String saida = num % 2 == 0 ? "é par" : "é impar";
        System.out.println(saida);
    }

    public static void Exe06(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite valor pago: ");
        int valor = entrada.nextInt();

        String saida = valor < 100 ? "Barato" : "Caro";
        System.out.println(saida);
    }

    public static void Exe07(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a estação em que está (1-primavera, 2-verão, 3-outono, 4-inverno): ");
        int estacao = entrada.nextInt();

        switch (estacao){
            case 1 : System.out.println("Primavera");
                break;
            case 2 : System.out.println("Verão");
                break;
            case 3 : System.out.println("Outono");
                break;
            case 4 : System.out.println("Inverno");
                break;
            default: System.out.println("Número inválido");
                break;
        }
    }

    public static void Exe08(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de 1 a 12 para representar o mês: ");
        int mes = entrada.nextInt();

        switch (mes){
            case 1 : System.out.println("Janeiro");
                break;
            case 2 : System.out.println("Fevereiro");
                break;
            case 3 : System.out.println("Março");
                break;
            case 4 : System.out.println("Abril");
                break;
            case 5 : System.out.println("Maio");
                break;
            case 6 : System.out.println("Junho");
                break;
            case 7 : System.out.println("Julho");
                break;
            case 8 : System.out.println("Agosto");
                break;
            case 9 : System.out.println("Setembro");
                break;
            case 10 : System.out.println("Outubro");
                break;
            case 11: System.out.println("Novembro");
                break;
            case 12 : System.out.println("Dezembro");
                break;
            default: System.out.println("Número invãlido");
                break;
        }
    }
}
