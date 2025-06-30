package com.estudo.arquivos.introducao.revisao.tiposprimitivos01;

public class TiposPrimitivosRevisao {
    public static void main(String[] args) {
        //Exe01();
        //Exe02();
        //Exe03();
        //Exe04();
        Exe05();
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
        int idade1 = 18;
        int idade2 = 23;

        boolean isBigster = idade1 > idade2;
        System.out.println(isBigster);
    }
}


