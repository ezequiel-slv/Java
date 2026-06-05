package com.revisao.arquivos.poo02.estatico05.blocoinicializacao01.dominio;

public class Computador {
    private static String processadorPadrao;

    static {
        processadorPadrao = System.getProperty("os.arch");
    }

    public static void processadorPadrao(){
        System.out.println("Processador Padrao: " + processadorPadrao);
    }
}
