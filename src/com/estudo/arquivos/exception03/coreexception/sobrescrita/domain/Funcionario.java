package com.estudo.arquivos.exception03.coreexception.sobrescrita.domain;

import com.estudo.arquivos.exception03.coreexception.customizedexception.domain.Login;

public class Funcionario extends Pessoa{

    @Override
    public void salvar() throws Login, ClassCastException {
        super.salvar();
    }
}
