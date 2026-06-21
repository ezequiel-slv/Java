package com.core.exception03.coreexception.error;

public class StackOverFlowTeste {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade(){
        recursividade();
    }
}
