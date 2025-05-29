package com.estudo.arquivos.poo.exception.sobrescrita.domain;

import com.estudo.arquivos.poo.exception.customizedexception.domain.Login;

public class Pessoa {

    public void salvar() throws Login{
        System.out.println("Salvando funcionário");
    }
}
