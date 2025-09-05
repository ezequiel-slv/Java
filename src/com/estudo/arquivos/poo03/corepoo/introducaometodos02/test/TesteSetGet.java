package com.estudo.arquivos.poo03.corepoo.introducaometodos02.test;

import com.estudo.arquivos.poo03.corepoo.introducaometodos02.dominio.Pessoa;

public class TesteSetGet {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Ezequiel");
        pessoa.setIdade(22);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        pessoa.imprime();

    }
}
