package com.estudo.arquivos.poo.revisao.exception14.error;

public class StackOverFlow {
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }
}
