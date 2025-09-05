package com.estudo.arquivos.exception04.revisao.error;

public class StackOverFlow {
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }
}
