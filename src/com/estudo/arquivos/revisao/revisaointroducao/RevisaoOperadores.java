package com.estudo.arquivos.revisao.revisaointroducao;
import java.util.Scanner;
public class RevisaoOperadores {
    public static void main(String[] args) {
        Scanner numeroum = new Scanner(System.in);
        int primeiroNumero;
        System.out.println("Digite o primeiro número: ");
        primeiroNumero = numeroum.nextInt();
        System.out.println("O primeiro número é: " + primeiroNumero);

        Scanner numerodois = new Scanner(System.in);
        int segundoNumero;
        System.out.println("Digite o segundo número: ");
        segundoNumero = numeroum.nextInt();
        System.out.println("O segundo número é: " + segundoNumero);

        Scanner numerotres = new Scanner(System.in);
        int terceiroNumero;
        System.out.println("Digite o terceiro número: ");
        terceiroNumero = numeroum.nextInt();
        System.out.println("O terceiro número é: " + terceiroNumero);

        boolean calculo = primeiroNumero > terceiroNumero || segundoNumero >= primeiroNumero;
        System.out.println("O primeiro número é maior que o terceiro numero ou o sengundo número é maior ou igual o primero número: " + calculo);

    }
}
