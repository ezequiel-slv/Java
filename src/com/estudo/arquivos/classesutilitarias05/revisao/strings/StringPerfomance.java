package com.estudo.arquivos.classesutilitarias05.revisao.strings;

public class StringPerfomance {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        StringPuro(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução do programa String puro: " + (fim - inicio) + " ms");

        System.out.println("-----");

        long inicio2 = System.currentTimeMillis();
        StringBuilder(100_000);
        long fim2 = System.currentTimeMillis();
        System.out.println("Tempo de execução do programa String builder: " + (fim2 - inicio2) + " ms");

        System.out.println("-----");

        long inicio3 = System.currentTimeMillis();
        StringBuffer(100_000);
        long fim3 = System.currentTimeMillis();
        System.out.println("Tempo de execução do programa String buffer: " + (fim3 - inicio3) + " ms");
    }

    private static void StringPuro(int tamanho){
        String texto = "";

        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void StringBuilder(int tamanho){
        StringBuilder texto = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            texto.append(i);
        }
    }

    private static void StringBuffer(int tamanho){
        StringBuilder texto = new StringBuilder(tamanho);

        for (int i = 0; i < tamanho; i++) {
            texto.append(i);
        }
    }
}
