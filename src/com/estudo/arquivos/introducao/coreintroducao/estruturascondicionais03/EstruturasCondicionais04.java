package com.estudo.arquivos.introducao.coreintroducao.estruturascondicionais03;
import java.util.Scanner;

public class EstruturasCondicionais04 {
    public static void main(String[] args) {
        Scanner semana = new Scanner (System.in);
        byte diaSemana;
        System.out.println("Digite o dia da semana considerando 1 como segunda e assim por diante: ");
        diaSemana = semana.nextByte();

        switch (diaSemana) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                break;
        }
    }
}
