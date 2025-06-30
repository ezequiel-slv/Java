package com.estudo.arquivos.poo.src.exception14.sobrescrita.domain;

import com.estudo.arquivos.poo.src.exception14.customizedexception.domain.Login;

public class Funcionario extends Pessoa{

    @Override
    public void salvar() throws Login, ClassCastException {
        super.salvar();
    }
}
