package com.estudo.arquivos.poo.exception.sobrescrita.test;

import com.estudo.arquivos.poo.exception.customizedexception.domain.Login;
import com.estudo.arquivos.poo.exception.sobrescrita.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (Login | ClassCastException e) {
            throw new RuntimeException(e);
        }
    }
}
