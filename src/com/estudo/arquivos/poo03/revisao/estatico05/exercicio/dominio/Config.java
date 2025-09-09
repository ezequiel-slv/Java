package com.estudo.arquivos.poo03.revisao.estatico05.exercicio.dominio;

import java.time.LocalDate;

public class Config {
    private static final String versao = "System version: 1.o";

    static {
        System.out.println("Classe Config carregada!");
    }

    public static void mostrarVersao(){
        System.out.println(versao);
    }
}
