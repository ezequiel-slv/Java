package com.estudo.arquivos.poo.revisao.modificadorfinal09.teste;

import com.estudo.arquivos.poo.revisao.modificadorfinal09.dominio.Cadastro;


public class CadastroTeste {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        cadastro.armazenarDados.setComandoCreate("Dados armazenados.");
        cadastro.inittCadastro();
        cadastro.imprime();

    }
}
