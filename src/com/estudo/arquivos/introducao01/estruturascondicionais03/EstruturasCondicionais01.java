package com.estudo.arquivos.introducao01.estruturascondicionais03;

import java.util.Scanner;

public class EstruturasCondicionais01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade = entrada.nextInt();

        boolean condicao1 = idade >= 18;

        if (condicao1) {
            System.out.println("Permitido para dirigir");
        }
        //  ! nega a senteça retornando o contrario de verdadeiro caso a condição seja falsa
        if(!condicao1) {
            System.out.println("Não permitido para dirigir");
        }
    }

}
