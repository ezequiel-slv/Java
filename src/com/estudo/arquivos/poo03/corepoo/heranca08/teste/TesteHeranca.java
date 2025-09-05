package com.estudo.arquivos.poo03.corepoo.heranca08.teste;

import com.estudo.arquivos.poo03.corepoo.heranca08.dominio.Endereco;
import com.estudo.arquivos.poo03.corepoo.heranca08.dominio.Funcionario;
import com.estudo.arquivos.poo03.corepoo.heranca08.dominio.Pessoa;

public class TesteHeranca {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua A");
        endereco.setCep("3450-159");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Fulano");
        pessoa.setIdade(20);
        pessoa.setEndereco(endereco);
        pessoa.imprime();


        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Ezeuiel");
        funcionario.setIdade(22);
        endereco.setCep("33344-200");
        endereco.setRua("Rua E");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2500);
        funcionario.imprime();
        funcionario.imprime2();

    }
}
