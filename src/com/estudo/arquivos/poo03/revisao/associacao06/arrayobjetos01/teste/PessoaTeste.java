package com.estudo.arquivos.poo03.revisao.associacao06.arrayobjetos01.teste;

import com.estudo.arquivos.poo03.revisao.associacao06.arrayobjetos01.dominio.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Maria", 18, "4435245544354");
        Pessoa p2 = new Pessoa("João", 19, "23424242424234");
        Pessoa p3 = new Pessoa("Julia", 21, "6565767667u67");

        Pessoa [] pessoas = {p1, p2, p3};
        for (Pessoa pessoa : pessoas) {
            pessoa.imprimir();
        }

    }
}
