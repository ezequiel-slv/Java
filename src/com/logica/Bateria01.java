package com.logica;

import java.util.Scanner;

public class Bateria01 {
    public static void main(String[] args) {
//        exe01();
//        exe02();
//        exe03();
//        exe04();
//        exe05();
//        exe06();
//        exe07();
//        exe08();
//        exe09();
//        exe10();
//        exe11();
//        exe12();
//        exe13();
//        exe14();
//        exe15();
//        exe16();
//        exe17();
        exe18();
    }

    public static void exe01(){
        /*
        a) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é F
        ← C * 9 / 5 + 32, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
        */

        double c = 30;

        double f = c * 9 / 5 + 32;

        System.out.printf("%.0f graus Celsius equivale a %.0f graus Fahrenheit %n", c, f);
    }

    public static void exe02(){
        /*
         b) Ler uma temperatura em graus Fahrenheit e apresentá-la
        convertida em graus Celsius. A fórmula de conversão é C ←
        ((F – 32) * 5) / 9, sendo F a temperatura em Fahrenheit e C
        */

        double f = 20;

        double c = ((f - 32) * 5) / 9;

        System.out.printf("%.0f graus Fahrenheit equivale a %.0f graus Celsius %n", f, c);
    }

    public static void exe03(){
        /*
        c) Calcular e apresentar o valor do volume de uma lata de
        óleo, utilizando a fórmula VOLUME ← 3.14159 * R ↑ 2 *
        ALTURA.
        */

        double r = 3;

        double a = 1.80;

        double v = 3.14159 * (r * r) * a;

        System.out.printf("Volume da lata: %.2f %n", v);
    }

    public static void exe04(){
        /*
        d) Efetuar o cálculo da quantidade de litros de combustível
        gasta numa viagem, utilizando um automóvel que faz 12
        quilômetros por litro. Para obter o cálculo, o usuário deve
        fornecer o tempo gasto (variável TEMPO) e a velocidade
        média (variável VELOCIDADE) durante a viagem. Dessa
        forma, será possível obter a distância percorrida com a
        fórmula DISTÂNCIA ← TEMPO * VELOCIDADE. A partir do
        valor da distância, basta calcular a quantidade de litros de
        combustível utilizada na viagem com a fórmula
        LITROS_USADOS ← DISTÂNCIA / 12. O programa deve
        apresentar os valores da velocidade média, tempo gasto na
        viagem, a distância percorrida e a quantidade de litros
        utilizada na viagem.
        */

        double tempo = 4.30;

        double velocidade = 80;

        double distancia = tempo * velocidade;

        double litrosUsados = distancia / 12;


        System.out.printf("Tempo de viajem: %.2f horas %n", tempo);
        System.out.printf("Velocidade média: %.0f km/h %n", velocidade);
        System.out.printf("Distância percorrida: %.0f km %n", distancia);
        System.out.printf("Litros usados: %.0f L %n", litrosUsados);
    }

    public static void exe05(){
        /*
        e) Efetuar o cálculo e apresentar o valor de uma prestação de
        um bem em atraso, utilizando a fórmula PRESTAÇÃO ←
        VALOR + (VALOR * (TAXA / 100) * TEMPO).
        */

        double valor = 385;
        double taxa = 20;
        double tempoMes = 3;

        double prestacao = valor + (valor + (taxa / 100) * tempoMes);

        System.out.println("Prestaçãp a ser pega com acressímos: " + prestacao);
    }

    public static void exe06(){
        /*
        f) Ler dois valores para as variáveis A e B e efetuar a troca dos
        valores de forma que a variável A passe a possuir o valor da
        variável B e a variável B passe a possuir o valor da variável
        A. Apresentar os valores após a efetivação do
        processamento da troca.
        */

        int a = 2;

        int b = 4;

        int temp = a;

        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }


    public static void exe07(){
        /*
        g) Ler quatro valores numéricos inteiros e apresentar os
        resultados armazenados em memória das adições e
        multiplicações utilizando o mesmo raciocínio aplicado
        quando do uso de propriedades distributivas para a máxima
        combinação possível entre as quatro variáveis. Não é para
        calcular a propriedade distributiva, deve-se apenas usar a
        sua forma de combinação. Considerando a leitura de valores
        para as variáveis A, B, C e D, devem ser feitas seis adições
        e seis multiplicações, ou seja, deve ser combinada a
        variável A com a variável B, a variável A com a variável C, a
        variável A com a variável D. Depois, é necessário combinar
        a variável B com a variável C e a variável B com a variável D
        e, por fim, a variável C será combinada com a variável D.
        */

        int a = 10;
        int b = 20;
        int c = 40;
        int d = 80;

        System.out.println("Adição: " + (a + b));
        System.out.println("Adição: " + (a + c));
        System.out.println("Adição: " + (a + d));
        System.out.println("Adição: " + (b + c));
        System.out.println("Adição: " + (b + d));
        System.out.println("Adição: " + (c + d));

        System.out.println("-----");

        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Multiplicação: " + (a * c));
        System.out.println("Multiplicação: " + (a * d));
        System.out.println("Multiplicação: " + (b * c));
        System.out.println("Multiplicação: " + (b * d));
        System.out.println("Multiplicação: " + (c * d));
    }

    public static void exe08(){
        /*
        h) Elaborar um programa que calcule e apresente o valor do
        volume de uma caixa retangular, utilizando a fórmula
        VOLUME ← COMPRIMENTO * LARGURA * ALTURA.
        */

        double comprimento = 30;
        double largura = 10;
        double altura = 25;

        double volume = comprimento * largura * altura;

        System.out.println("Volume da caixa: " + volume + "L");
    }

    public static void exe09(){
        /*
        i) Efetuar a leitura de um valor numérico inteiro e apresentar o
        resultado do valor lido elevado ao quadrado, sem efetuar o
        armazenamento do resultado em memória.
        */

        int valor = 15;

        System.out.println("Resultado de "+ valor + " elevado ao quadrado: "  + valor * valor);
    }

    public static void exe10(){
        /*
        j) Ler dois valores numéricos inteiros (representados pelas
        variáveis A e B) e apresentar o resultado armazenado em
        memória do quadrado da diferença do primeiro valor
        (variável A) em relação ao segundo valor (variável B).
        */

        int a = 20;
        int b = 10;

        double result = (a - b)*(a - b);

        System.out.println("Resultado: " + result);
    }

    public static void exe11(){
        /*
        k) Elaborar um programa que apresente o valor da conversão
        em real (R$) de um valor lido em dólar (US$). O programa
        deve solicitar o valor da cotação do dólar e também a
        quantidade de dólares disponível com o usuário e
        armazenar em memória o valor da conversão antes da
        apresentação.
        */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor em dolar: ");
        double valorDolar = entrada.nextDouble();

        System.out.println("Digite a cotação do dólar: ");
        double valorCotacao = entrada.nextDouble();

        double conversaoReal = valorDolar * valorCotacao;

        System.out.printf("%.2f Dólares equivale a %.2f em Real", valorDolar, conversaoReal);
    }

    public static void exe12(){
        /*
        l) Elaborar um programa que apresente o valor da conversão
        em dólar (US$) de um valor lido em real (R$). O programa
        deve solicitar o valor da cotação do dólar e também a
        quantidade de reais disponível com o usuário e armazenar
        em memória o valor da conversão antes da apresentação.
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor em Real: ");
        double valorReal = entrada.nextDouble();

        System.out.println("Digite a cotação do Dólar: ");
        double valorCotacao = entrada.nextDouble();

        double conversaoDolar = valorReal / valorCotacao;

        System.out.printf("%.2f Reais equivale a %.2f Dólares", valorReal, conversaoDolar);
    }

    public static void exe13(){
        /*
        m) Construir um programa que leia três valores numéricos
        inteiros (representados pelas variáveis A, B e C) e
        apresentar como resultado final, armazenado em memória,
        o valor da soma dos quadrados dos três valores lidos.
         */

        int a = 10;
        int b = 40;
        int c = 23;

        double result = (a*a) + (b*b) + (c*c);
        System.out.println("Resultado: " + result);
    }

    public static void exe14(){
        /*
        n) Construir um programa que leia três valores numéricos
        inteiros (representados pelas variáveis A, B e C) e
        apresentar como resultado final, armazenado em memória,
        o valor do quadrado da soma dos três valores lidos.
         */

        int a = 3;
        int b = 20;
        int c = 12;

        double result = (a + b + c) * (a + b + c);
        System.out.println("Resultaado: " + result);
    }

    public static void exe15(){
        /*
        o) Elaborar um programa que leia quatro valores numéricos
        inteiros (variáveis A, B, C e D). Ao final, o programa deve
        apresentar o resultado, armazenado em memória, do
        produto (variável P) do primeiro com o terceiro valor, e o
        resultado da soma (variável S) do segundo com o quarto
        valor.
         */

        int a = 3;
        int b = 8;
        int c = 2;
        int d = 6;

        double p = a * c;
        double s = b + d;

        System.out.println("Produto de a e c: " + p);
        System.out.println("Soma de b e d: " + s);
    }

    public static void exe16(){
        /*
        p) Elaborar um programa que leia o valor numérico
        correspondente ao salário mensal (variável SM) de um
        trabalhador e também fazer a leitura do valor do percentual
        de reajuste (variável PR) a ser atribuído. Apresentar o valor
        do novo salário (variável NS) após o armazenamento do
        cálculo em memória.
         */

        double sm = 1.500;
        double pr = 0.20;
        double ns = sm + (sm * pr);

        System.out.printf("Salário base: %.3f\n", sm);
        System.out.printf("Salário com reajuste: %.3f", ns);
    }

    public static void exe17(){
        /*
        q) Elaborar um programa que calcule e apresente o valor do
        resultado da área de uma circunferência (variável A). O
        programa deve solicitar a entrada do valor do raio da
        circunferência (variável R). Para a execução deste
        problema, utilize a fórmula A ← 3.14159265* R ↑ 2.
         */
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do raio da circunferẽncia: ");
        double valorR = entrada.nextDouble();

        double pi = 3.14159265;

        double a = pi * Math.pow(valorR, 2);

        System.out.printf("Resultado: %.2f", a);
    }

    public static void exe18(){
        /*
            r) Numa eleição sindical concorreram ao cargo de
            presidente três candidatos (representados pelas variáveis A,
            B e C). Durante a apuração dos votos foram computados
            votos nulos e em branco, além dos votos válidos para cada
            candidato. Deve ser criado um ‘software’ que
            faça a leitura da quantidade de votos válidos para cada
            candidato, além de ler também a quantidade de votos nulos
            e em branco. Ao final, o programa deve apresentar o
            número total de eleitores, considerando votos válidos, nulos
            e em branco; o percentual correspondente de votos válidos
            em relação à quantidade de eleitores; o percentual
            correspondente de votos válidos do candidato A em relação
            à quantidade de eleitores; o percentual correspondente de
            votos válidos do candidato B em relação à quantidade de
            eleitores; o percentual correspondente de votos válidos do
            candidato C em relação à quantidade de eleitores; o
            percentual correspondente de votos nulos em relação à
            quantidade de eleitores; e, por último, o percentual
            correspondente de votos em branco em relação à
            quantidade de eleitores. Todos os cálculos devem
            efetivamente ser armazenados em memória.
         */

        double votoNulo = 41;
        double votoBranco = 206;

        double votoNaoValido = votoBranco + votoNulo;

        double candidatoA = 387;
        double candidatoB = 1156;
        double candidatoC = 844;

        double votoValido = candidatoA + candidatoB + candidatoC;
        double totalEleitores = votoValido + votoNaoValido;
        double porcVotosValidos = (votoValido * 100) / totalEleitores;
        double porcCandidatoA = (candidatoA * 100) / totalEleitores;
        double porcCandidatoB = (candidatoB * 100) / totalEleitores;
        double porcCandidatoC = (candidatoC * 100) / totalEleitores;


        System.out.printf("Total de eleitores: %.0f\n", totalEleitores);

        System.out.printf("Votos válidos: %.0f\n", votoValido);

        System.out.printf("Percentual correspondente de votos válidos em relação à quantidade de eleitores: %.0f\n", porcVotosValidos);

        System.out.printf("Percentual correspondente de votos válidos do candidato A em relação à quantidade de eleitores: %.0f\n", porcCandidatoA);
        System.out.printf("Percentual correspondente de votos válidos do candidato B em relação à quantidade de eleitores: %.0f\n", porcCandidatoB);
        System.out.printf("Percentual correspondente de votos válidos do candidato C em relação à quantidade de eleitores: %.0f\n", porcCandidatoC);

    }
}
