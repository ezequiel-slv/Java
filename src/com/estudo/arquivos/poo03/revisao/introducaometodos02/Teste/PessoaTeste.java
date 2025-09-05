package com.estudo.arquivos.poo03.revisao.introducaometodos02.Teste;

import com.estudo.arquivos.poo03.revisao.introducaometodos02.dominio.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ezequiel");
        pessoa.setEmail("ezequielsilvalima01@gmail.com");
        pessoa.setIdade(23);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Email: " + pessoa.getEmail());
    }
}
