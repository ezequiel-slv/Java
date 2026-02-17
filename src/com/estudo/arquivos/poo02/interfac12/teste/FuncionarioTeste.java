package com.estudo.arquivos.poo02.interfac12.teste;

import com.estudo.arquivos.poo02.interfac12.dominio2.Funcionario;
import com.estudo.arquivos.poo02.interfac12.dominio2.VerificadorDeAusencia;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Ezequiel");
        funcionario.setIdade(23);
        funcionario.setCpf("9232324222");
        funcionario.setSalario(3000);
        funcionario.imprime();
        funcionario.validarPresenca();
        VerificadorDeAusencia.datasessao();
    }
}
