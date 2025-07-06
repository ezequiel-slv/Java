package com.estudo.arquivos.poo.corepoo.estatico05.blocodeinicializacao.dominio;

public class SistemaOperacional {
    static  String SO_PADRAO;

    static {
        SO_PADRAO = System.getProperty("os.name");
    }

    public static void sistema(){
        System.out.println("Sistema Operacional da maquina: "+ SO_PADRAO);
    }

}
