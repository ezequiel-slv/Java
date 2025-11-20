package com.estudo.arquivos.poo03.revisao.exception14.teste;

import com.estudo.arquivos.poo03.revisao.exception14.dominio.Funcionario;
import com.estudo.arquivos.poo03.revisao.exception14.dominio.LoginInvalido;
import com.estudo.arquivos.poo03.revisao.exception14.dominio.Pessoa;

import java.io.FileNotFoundException;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        try {
            pessoa.salvar();
        } catch (LoginInvalido | FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Funcionario funcionario = new Funcionario();
        try {
            funcionario.salvar();
        } catch (LoginInvalido | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
