package com.estudo.arquivos.poo.corepoo.exception14.RuntimeException;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {

        int[] numeros = {10, 15, 20};
        System.out.println(numeros[3]);
        /* ArrayIndexOutOfBoundsException acontece quando uma posição
        do array não está definida por nenhum número
        exemplo: 10 é posição 0, 15 é 1 e 20 é 2. já três não contém valor
         */
    }
}
