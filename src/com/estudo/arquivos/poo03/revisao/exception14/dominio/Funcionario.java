package com.estudo.arquivos.poo03.revisao.exception14.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    @Override
    public void salvar() throws LoginInvalido, FileNotFoundException {
        System.out.println("Salvando funcionário...");
    }
}
