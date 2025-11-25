package com.estudo.arquivos.poo03.revisao.classesutilitarias15.parte2;

public class Desempenho {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        DesempenhoString(10_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução do programa String: " + (fim - inicio) + "ms");

        System.out.println("--------");

        inicio = System.currentTimeMillis();
        DesempenhoStringBuilder(10_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução do programa StringBuilder: " + (fim - inicio) + "ms");

        System.out.println("--------");

        inicio = System.currentTimeMillis();
        DesempenhoStringBuffer(10_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução do programa StringBuffer: " + (fim - inicio) + "ms");
    }

    public static void DesempenhoString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    public static void DesempenhoStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    public static void DesempenhoStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
