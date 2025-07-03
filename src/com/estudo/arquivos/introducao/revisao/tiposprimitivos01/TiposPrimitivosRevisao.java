package com.estudo.arquivos.introducao.revisao.tiposprimitivos01;

import java.util.Scanner;

public class TiposPrimitivosRevisao {
    public static void main(String[] args) {
        Exe01();
        System.out.println("----");
        Exe02();
        System.out.println("----");
        Exe03();
        System.out.println("----");
        Exe04();
        System.out.println("----");
        Exe05();
        System.out.println("----");
        Exe06();
        System.out.println("----");
        Exe07();
        System.out.println("----");
        Exe08();
        System.out.println("----");
        Exe09();
        System.out.println("----");
        Exe10();
    }
    public static void Exe01(){

        String nome = "Ezequiel";
        int idade = 23;
        double peso = 70;
        char sexo = 'M';

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Sexo: " + sexo);
    }

    public static  void Exe02(){
        int num1 = 30;
        int num2 = 20;

        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + div);
    }

    public static void Exe03(){
        double num = 10.0;
        int cast = (int) num;
        System.out.println(cast);
    }

    public static void Exe04(){
        byte byteMax = 127;
        byte byteMin = -128;
        System.out.println(byteMax);
        System.out.println(byteMin);

        System.out.println("------");

        short shortMax = 32767;
        short shortMin = 32767;
        System.out.println(shortMax);
        System.out.println(shortMin);

        System.out.println("------");

        int intMax = 2147483647;
        int intMin = -2147483647;
        System.out.println(intMax);
        System.out.println(intMin);

        System.out.println("------");

        long longMax = 9_223_372_036_854_775_807L;
        long longMin = -9_223_372_036_854_775_807L;
        System.out.println(longMax);
        System.out.println(longMin);

        System.out.println("------");
    }

    public static void Exe05(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma idade: ");
        int idade1 = entrada.nextInt();

        System.out.println("Digite outra idade: ");
        int idade2 = entrada.nextInt();

        boolean isBigster = idade1 > idade2;
        System.out.println(isBigster);
    }

    public static void Exe06(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("Digite seu altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Digite seu pesp: ");
        double peso = entrada.nextDouble();

        System.out.println("Idade: " + idade + " Anos");
        System.out.printf("Altura: %.2f\n", altura);
        System.out.println("Peso: " + peso + "Kg");
    }

    public static void Exe07(){
        float pessoa1 = 1.60F;
        float pessoa2 = 1.68F;
        float pessoa3 = 1.86F;

        float media = (pessoa1 + pessoa2 + pessoa3)/ 3;
        System.out.printf("Média das alturas: %.2f\n", media);
    }

    public static void Exe08(){
        double peso = 70;
        double altura = 1.70;

        double imc = peso/(altura * altura);
        System.out.printf("IMC: %.2f\n", imc);
    }

    public static void Exe09(){
        int aConv = 'A';
        System.out.println(aConv);
    }

    public static void Exe10(){
        String nome = "Ezequiel";
        char sexo = 'M';
        int idade = 23;
        float altura = 1.70F;
        double peso = 70;
        long cpf = 62555292314L;

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(sexo);
        System.out.println(altura);
        System.out.println(peso);
        System.out.println(cpf);
    }
}


