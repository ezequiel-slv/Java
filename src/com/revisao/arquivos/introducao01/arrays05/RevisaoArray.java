package com.revisao.arquivos.introducao01.arrays05;

import java.util.Arrays;
import java.util.Scanner;

public class RevisaoArray {
    public static void main(String[] args) {
        exe07();
    }

    public static void exe01(){
//        Parte 1 — Arrays básicos
//
//        1) Crie um programa que:
//
//        Crie um array de int com 5 posições. Armazene os valores: 10, 20, 30, 40, 50. Imprima cada valor usando System.out.println.

        System.out.println("Exe01-----");

        Integer[] array = new Integer[5];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;


        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
//
//        2) Crie um array de double com 4 posições e armazene: 5.5, 7.2, 9.8, 10.0 Depois imprima todos os valores.

        System.out.println("Exe02-----");

        Double[] array2 = new Double[4];

        array2[0] = 5.5;
        array2[1] = 7.2;
        array2[2] = 9.8;
        array2[3] = 10.0;

        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);
        System.out.println(array2[3]);
//
//        3) Crie um array chamado idades com 4 posições. Armazene as idades: 18, 22, 35, 40
//
//        Depois imprima:

        System.out.println("Exe03-----");

        Integer[] idades = new Integer[4];

        idades[0] = 18;
        idades[1] = 22;
        idades[2] = 35;
        idades[3] = 40;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
        System.out.println(idades[3]);
    }

    public static void exe02(){
        /*
        4) Crie um array de String com 5 nomes. Use um laço for para imprimir todos os nomes.
         */

        System.out.println("Exe04-----");
        String[] nomes = new String[5];

        nomes[0] = "Ezequiel";
        nomes[1] = "Ezequiel II";
        nomes[2] = "Ezequiel III";
        nomes[3] = "Ezequiel IV";
        nomes[4] = "Ezequiel V";

        for (int nome = 0; nome < nomes.length; nome++){
            System.out.println(nomes[nome]);
        }

        /*
        5) Crie um array com os números: 2, 4, 6, 8, 10 Use um for para: imprimir cada número imprimir também o índice do número
        */

        System.out.println("Exe05-----");
        int[] numeros = new int[5];

        numeros[0] = 2;
        numeros[1] = 4;
        numeros[2] = 6;
        numeros[3] = 8;
        numeros[4] = 10;

        for (int num = 0; num < numeros.length; num++){
            System.out.println("Indice: " +  num + " | Valor: " + numeros[num]);
        }

        System.out.println("Exe06-----");
        /*
        6) Crie um array com 6 números inteiros. Use um for para: calcular a soma de todos os números imprimir o resultado final.
         */

        int[] numeros2 = new int[6];
        numeros2[0] = 1;
        numeros2[1] = 2;
        numeros2[2] = 3;
        numeros2[3] = 4;
        numeros2[4] = 5;
        numeros2[5] = 6;

        int soma = 0;

        for (int num2 = 0; num2 < numeros2.length; num2++){
            soma += numeros2[num2];
        }
        System.out.println("Soma: " + soma);
    }

    public static void exe03(){
        /*
        7) Crie um array com 5 cidades Use .length dentro de um for para imprimir todas.
        */
        System.out.println("Exe07-----");

        Integer[] numeros = new Integer[5];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int num = 0; num < numeros.length; num++){
            System.out.println(numeros[num]);
        }

        /*
        8) Crie um array com 8 números. Use .length para imprimir quantos elementos o array possui.

        Exemplo esperado: O array possui 8 posições
         */
        System.out.println("Exe08-----");

        Integer[] numeros2 = new Integer[8];
        numeros2[0] = 1;
        numeros2[1] = 2;
        numeros2[2] = 3;
        numeros2[3] = 4;
        numeros2[4] = 5;
        numeros2[5] = 6;
        numeros2[6] = 7;
        numeros2[7] = 8;

        int resultado = 0;
        for (int i = 0; i < numeros2.length; i++){
                resultado = i;
        }
        System.out.println(" 1 Array possui: " +numeros2[resultado] + " posições");

            /*
    9) Crie um array com os dias da semana:
     */
        System.out.println("Exe09-----");

        String[] diasSemana = new String[7];

        diasSemana[0] = "Segunda-feira";
        diasSemana[1] = "Tercça-feira";
        diasSemana[2] = "Quarta-feira";
        diasSemana[3] = "Quinta-feira";
        diasSemana[4] = "Sexta-feira";
        diasSemana[5] = "Sábado";
        diasSemana[6] = "Domingo";

        for (String dia: diasSemana){
            System.out.println(dia);
        }

        System.out.println("Exe10-----");
        /*
        10) Crie um array com números: 3, 6, 9, 12, 15
         */

        Integer[] numeros3 = new Integer[5];
        numeros3[0] = 3;
        numeros3[1] = 6;
        numeros3[2] = 9;
        numeros3[3] = 12;
        numeros3[4] = 15;

        for (int num3 : numeros3){
            System.out.println(num3);
        }
    }

    public static void exe04(){
        System.out.println("Exe11-----");

        /*
        11) Crie uma matriz int[2][3].

        Preencha com valores:

        1 2 3
        4 5 6
         */

        Integer[][] matriz = new Integer[2][3];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        for (int a = 0; a < matriz.length; a++){
            for(int b = 0; b < matriz[a].length; b++){
                System.out.println(matriz[a][b]);
            }
        }

                    /*
            12) Crie uma matriz int[3][3].

            Preencha com:

            1 2 3
            4 5 6
            7 8 9
             */

        System.out.println("12)-----");

        Integer[][] matriz2 = new Integer[3][3];

        matriz2[0][0] = 1;
        matriz2[0][1] = 2;
        matriz2[0][2] = 3;

        matriz2[1][0] = 4;
        matriz2[1][1] = 5;
        matriz2[1][2] = 6;

        matriz2[2][0] = 7;
        matriz2[2][1] = 8;
        matriz2[2][2] = 9;

        for (int a = 0; a < matriz2.length; a++){
            for(int b = 0; b < matriz2[a].length; b++){
                System.out.println(matriz2[a][b]);
            }
        }
    }

    public static void exe05(){
                /*
        13) Crie a matriz:

        10 20 30
        40 50 60

        Use foreach para imprimir todos os valores.
         */
        System.out.println("13-----");

        Integer[][] matriz3 = new Integer[2][3];

        matriz3[0][0] = 10;
        matriz3[0][1] = 20;
        matriz3[0][2] = 30;

        matriz3[1][0] = 40;
        matriz3[1][1] = 50;
        matriz3[1][2] = 60;

        for (Integer[] a : matriz3){
            System.out.println(Arrays.toString(a));
        }
    }

    public static void exe06(){
        /*
        14) Crie um array bidimensional onde:

        linha 1 → 2 elementos

        linha 2 → 4 elementos

        linha 3 → 3 elementos

        Depois percorra com foreach e imprima todos.
         */

        System.out.println("14-----");

        Integer[][] matriz4 = new Integer[3][4];

        matriz4[0][0] = 1;
        matriz4[0][1] = 2;

        matriz4[1][0] = 3;
        matriz4[1][1] = 4;
        matriz4[1][2] = 5;
        matriz4[1][3] = 6;

        matriz4[2][0] = 7;
        matriz4[2][1] = 8;
        matriz4[2][2] = 9;

        for (Integer[] a : matriz4){
            System.out.println(Arrays.toString(a));
        }
    }

    public static void exe07(){
        /*
        15) Crie um programa que:

        tenha uma matriz int[3][3]

        peça para o usuário preencher os valores

        imprima a matriz completa.
         */

        System.out.println("15-----");

        Scanner entrada = new Scanner(System.in);
        Integer[][] matriz = new Integer[3][3];

        for (int a = 0; a < 3; a++){
            for (int b = 0; b < 3; b++){
                System.out.println("Digite um número: ");
                matriz[a][b] = entrada.nextInt();
            }
        }

        for (Integer[] c : matriz){
            System.out.println(Arrays.toString(c));
        }

        entrada.close();
    }
}
