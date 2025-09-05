package com.estudo.arquivos.exception04.coreexception.runtimeexception;

public class IllegalArgumentException {
    public static void main(String[] args) {
        double preco = -2;

        if (preco < 0){
            throw new java.lang.IllegalArgumentException("Preço inválido");
        }
        System.out.println(preco);

        /*
        IllegalArgumentException é uma exceção do tipo RuntimeException lançada quando um
         método recebe um argumento inválido ou inaceitável, mesmo que o tipo esteja correto.
         */
    }
}
