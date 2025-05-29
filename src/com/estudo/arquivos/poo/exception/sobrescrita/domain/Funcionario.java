package com.estudo.arquivos.poo.exception.sobrescrita.domain;

import com.estudo.arquivos.poo.exception.customizedexception.domain.Login;

public class Funcionario extends Pessoa{

    @Override
    public void salvar() throws Login, ClassCastException {
        super.salvar();
    }
}
