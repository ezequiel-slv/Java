package com.estudo.arquivos.poo.exception.RuntimeException;

import com.estudo.arquivos.poo.exception.dominio.IllegalArgument;

public class IllegalStateException {
    public static void main(String[] args) {
        IllegalArgument teste = new IllegalArgument();
        //teste.conectada();
        teste.enviarDados("Olá Mundo!");
    }
}
