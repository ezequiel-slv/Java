package com.core.exception03.coreexception.sobrescrita.test;

import com.core.exception03.coreexception.customizedexception.domain.Login;
import com.core.exception03.coreexception.sobrescrita.domain.Funcionario;

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
