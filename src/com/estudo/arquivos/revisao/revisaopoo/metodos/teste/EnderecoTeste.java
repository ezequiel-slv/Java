package com.estudo.arquivos.revisao.revisaopoo.metodos.teste;

import com.estudo.arquivos.revisao.revisaopoo.metodos.dominio.Endereco;

public class EnderecoTeste {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco();

        endereco1.cidade = "Washington D.C";
        endereco1.rua = "Av.Pensilvãnia";
        endereco1.numero = 1600;

        endereco1.imprime();
        }
}
