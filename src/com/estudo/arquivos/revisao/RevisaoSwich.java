package com.estudo.arquivos.revisao;
import java.util.Scanner;


public class RevisaoSwich {
    public static void main(String[] args) {
        Scanner sorteio = new Scanner(System.in);
        int numeroSorteado;
        System.out.println("Digite um número de 1 a 10 que pode ser o premiado: ");
        numeroSorteado = sorteio.nextInt();

        switch (numeroSorteado) {
            case 1:
                System.out.println("1: não premiado");
                break;
            case 2:
                System.out.println("2: premiado");
                break;
            case 3:
                System.out.println("1: não premiado");
                break;
            case 4:
                System.out.println("4: não premiado");
                break;
            case 5:
                System.out.println("5: não premiado");
                break;
            case 6:
                System.out.println("6: premiado");
                break;
            case 7:
                System.out.println("7: não premiado");
                break;
            case 8:
                System.out.println("8: não premiado");
                break;
            case 9:
                System.out.println("9: premiado");
                break;
            case 10:
                System.out.println("10: não premiado");
                break;
            default:
                break;
        }
    }
}
