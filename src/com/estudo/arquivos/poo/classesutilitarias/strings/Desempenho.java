package com.estudo.arquivos.poo.classesutilitarias.strings;

import java.lang.StringBuilder;

public class Desempenho {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        String(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução da String base: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        StringBuilder(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução da String Builder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        StringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução da String Buffer: " + (fim - inicio) + "ms");
    }

    public static void String(int tamanho){
        String numero = "";
        for (int i = 0; i < tamanho; i++) {
            numero += numero;
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
