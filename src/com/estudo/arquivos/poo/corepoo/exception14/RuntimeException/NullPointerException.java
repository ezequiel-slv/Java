package com.estudo.arquivos.poo.corepoo.exception14.RuntimeException;

public class NullPointerException {
    public static void main(String[] args) {

        String nome = null;
        System.out.println(nome.length());
    }
    //Nullpointer exception acontece quando um valor não é atribuido, ou seja, nulo
}
