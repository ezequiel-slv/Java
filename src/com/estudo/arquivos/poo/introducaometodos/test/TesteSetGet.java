package com.estudo.arquivos.poo.introducaometodos.test;

import com.estudo.arquivos.poo.introducaometodos.dominio.Pessoa;

public class TesteSetGet {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Ezequiel");
        pessoa.setIdade(22);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        //pessoa.imprime();

    }
}
