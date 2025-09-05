package com.estudo.arquivos.exception04.coreexception.sobrescrita.domain;

import com.estudo.arquivos.exception04.coreexception.customizedexception.domain.Login;

public class Pessoa {

    public void salvar() throws Login{
        System.out.println("Salvando funcionário");
    }
}
