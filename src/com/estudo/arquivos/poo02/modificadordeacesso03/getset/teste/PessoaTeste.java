package com.estudo.arquivos.poo02.modificadordeacesso03.getset.teste;

import com.estudo.arquivos.poo02.modificadordeacesso03.getset.dominio.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ezequiel");
        pessoa.setIdade(23);
        pessoa.Imprimir();
    }
}
