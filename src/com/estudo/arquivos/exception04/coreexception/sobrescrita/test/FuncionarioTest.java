package com.estudo.arquivos.exception04.coreexception.sobrescrita.test;

import com.estudo.arquivos.exception04.coreexception.customizedexception.domain.Login;
import com.estudo.arquivos.exception04.coreexception.sobrescrita.domain.Funcionario;

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
