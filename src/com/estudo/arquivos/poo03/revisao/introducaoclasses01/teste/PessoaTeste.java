package com.estudo.arquivos.poo03.revisao.introducaoclasses01.teste;

import com.estudo.arquivos.poo03.revisao.introducaoclasses01.dominio.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Ezequiel";
        pessoa.idade = 23;
        pessoa.sexo = 'M';
        pessoa.apelido = "Ezy";

        pessoa.nome = pessoa.apelido; //referência

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.idade);
        System.out.println("Sexo: " + pessoa.sexo);
    }
}
