package com.estudo.arquivos.poo.corepoo.exception14.error;

public class StackOverFlowTeste {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
