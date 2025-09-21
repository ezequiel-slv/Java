package com.estudo.arquivos.introducao01.revisao.whille;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        while (numero % 2 == 0) {
            System.out.println("Impar");
            break;
        }
        input.close();
    }
}
