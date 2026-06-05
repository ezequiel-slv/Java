package com.revisao.arquivos.poo02.estatico05.metodoestatico03.teste;

import com.revisao.arquivos.poo02.estatico05.metodoestatico03.dominio.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa.setCpf("1234567890");
        Pessoa pessoa = new Pessoa("Ezequiel", 24, "Masculino");
        pessoa.imprime();
    }
}
