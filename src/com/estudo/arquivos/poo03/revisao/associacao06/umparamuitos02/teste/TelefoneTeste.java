package com.estudo.arquivos.poo03.revisao.associacao06.umparamuitos02.teste;


import com.estudo.arquivos.poo03.revisao.associacao06.umparamuitos02.dominio.Pessoa;
import com.estudo.arquivos.poo03.revisao.associacao06.umparamuitos02.dominio.Telefone;

public class TelefoneTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ezequiel", 1);

        pessoa.addTelefones(new Telefone("99991135976", "Pessoal") );
        pessoa.exibirTelefone();
    }
}
