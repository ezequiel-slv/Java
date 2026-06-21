package com.core.exception03.coreexception.sobrescrita.domain;

import com.core.exception03.coreexception.customizedexception.domain.Login;

public class Pessoa {

    public void salvar() throws Login{
        System.out.println("Salvando funcionário");
    }
}
