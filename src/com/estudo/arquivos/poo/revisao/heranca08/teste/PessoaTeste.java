package com.estudo.arquivos.poo.revisao.heranca08.teste;

import com.estudo.arquivos.poo.revisao.heranca08.dominio.subdominio2.Endereco;
import com.estudo.arquivos.poo.revisao.heranca08.dominio.subdominio2.Funcionario;

public class PessoaTeste {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua A, 1000");
        endereco.setCep("1234-56");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Ezequiel");
        funcionario.setIdade(23);
        funcionario.setSexo('M');
        funcionario.setCpf(625552923);
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2400);

        funcionario.imprimir();

        Endereco endereco2 = new Endereco();
        endereco2.setRua("Rua B, 1500");
        endereco2.setCep("1234-00");

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Ezy");
        funcionario2.setIdade(23);
        funcionario2.setSexo('M');
        funcionario2.setCpf(432134442);
        funcionario2.setEndereco(endereco2);
        funcionario2.setSalario(1000);

        funcionario2.imprimir2();
    }
}
