package com.estudo.arquivos.poo.src.exception14.sobrescrita.domain;

import com.estudo.arquivos.poo.src.exception14.customizedexception.domain.Login;

public class Pessoa {

    public void salvar() throws Login{
        System.out.println("Salvando funcionário");
    }
}
