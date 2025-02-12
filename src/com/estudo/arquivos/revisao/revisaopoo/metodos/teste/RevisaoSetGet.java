package com.estudo.arquivos.revisao.revisaopoo.metodos.teste;

import com.estudo.arquivos.revisao.revisaopoo.metodos.dominio.Pessoa;

public class RevisaoSetGet {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("vegeta");
        pessoa.setIdade(63);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
