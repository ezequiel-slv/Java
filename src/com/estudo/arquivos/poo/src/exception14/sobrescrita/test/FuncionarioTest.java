package com.estudo.arquivos.poo.src.exception14.sobrescrita.test;

import com.estudo.arquivos.poo.src.exception14.customizedexception.domain.Login;
import com.estudo.arquivos.poo.src.exception14.sobrescrita.domain.Funcionario;

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
