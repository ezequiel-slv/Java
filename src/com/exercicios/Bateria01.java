package com.exercicios;

import java.util.Scanner;

public class Bateria01 {
    static int varGlobal = 30; // variável global

    public static void main(String[] args) {

        PrimeirosPassos01();
        Comentarios02();
        TiposDeDados03();
        ConversaoDeTipos04();
        OperacoesAritmeticas05();
        Constantes06();
        EntradaDeDados07();
        ConcatenaStrings08();
        TiposDeVariaveis09();
        FormatacaoDeSaida10();

    }

    public static void PrimeirosPassos01(){
        System.out.println("-----------");
        System.out.println("Meu nome é Ezequiel");
    }

    public static void Comentarios02(){
        System.out.println("-----------");
        // Comentário de linha: usado para fazer uma explanação breve

        /*
        Comentário de bloco: mais usado para explicações longas
         */

        /**
         * Comentário de documentação: como o nome já diz
         * é util para gerar arquivos de documentação automática
         */

        System.out.println("Comentários adicionados e explicados");
    }

    public static void TiposDeDados03(){
        System.out.println("-----------");
        int idade = 25;
        double altura = 1.75;
        char inicial = 'E';
        boolean estudante = true;

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Inicial: " + inicial);
        System.out.println("Estudante: " + estudante);
    }

    public static void ConversaoDeTipos04(){
        System.out.println("-----------");
        
        double numD = 3.3;
        int numI = (int) numD; // conversão explícita

        int inteiro = 10;
        double doubleN = inteiro; // conversão implícita

        System.out.println("double para int: " + numI);
        System.out.println("int para double: " + doubleN);
    }

    public static void OperacoesAritmeticas05() {
        System.out.println("-----------");

        int a = 10;
        int b = 2;

        int adicao = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int modulo = a % b;

        System.out.println("Adição: " + adicao);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplição: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Modulo: " + modulo);
    }

    public static void Constantes06() {
        System.out.println("-----------");

        final double velLuz = 299792458;
        System.out.println("Velocidade da luz: " + velLuz + " m/s");

   // velLuz = 30000000; // ---> exibe erro, já que foi iniciada como inalteravel (final)
    // System.out.println("Velocidade da luz: " + velLuz + " m/s");
    }

    public static void EntradaDeDados07() {
        System.out.println("-----------");
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = entrada.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = entrada.nextInt();

        double resultado = num1 + num2;

        System.out.println(resultado);
    }

    public static void ConcatenaStrings08() {
        System.out.println("-----------");
        Scanner entrada = new Scanner(System.in);

        String boaVindas = "Olá";

        System.out.println("Digite seu primeiro nome: ");
        String nome = entrada.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = entrada.next();

        String nomeCompleto = nome + " " + sobrenome;

        System.out.println(boaVindas + " " + nomeCompleto);
    }

    public static void TiposDeVariaveis09() {
        System.out.println("-----------");
        int varLocal = 20; // variável local

        System.out.println("Varável global: " + varGlobal); // vem de fora do metodo (própria classe)
        System.out.println("Variável local: " + varLocal); // vinda dp proprio metodo
    }

    public static void FormatacaoDeSaida10() {
        System.out.println("-----------");
        double num = 123.34452;

        System.out.printf("Número formatado: %.2f", num); // Imprime o número até
        // duas casas após a virgula
    }
}


