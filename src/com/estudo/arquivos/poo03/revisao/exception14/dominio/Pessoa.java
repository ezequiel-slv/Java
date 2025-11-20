package com.estudo.arquivos.poo03.revisao.exception14.dominio;

import java.io.FileNotFoundException;

public class Pessoa {

    public void salvar() throws LoginInvalido, FileNotFoundException{
        System.out.println("Salvar pessoa...");
    }
}
