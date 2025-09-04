package com.estudo.arquivos.poo.corepoo.classesutilitarias15.parte1.strings;

import java.lang.StringBuilder;

public class Desempenho {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        String(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução da String base: " + (fim - inicio) + "ms");

        long inicio2 = System.currentTimeMillis();
        StringBuilder(100_000);
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo de execução da String Builder: " + (fim2 - inicio2) + "ms");

        long inicio3 = System.currentTimeMillis();
        StringBuilder(100_000);
        long fim3 = System.currentTimeMillis();
        System.out.println("Tempo de execução da String Buffer: " + (fim3 - inicio3) + "ms");
    }

    public static void String(int tamanho){
        String numero = "";
        for (int i = 0; i < tamanho; i++) {
            numero += i;
        }
    }

    public static void StringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    public static void StringBuffer(int tamanho){
        StringBuffer sbf = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sbf.append(i);
        }
    }
}
