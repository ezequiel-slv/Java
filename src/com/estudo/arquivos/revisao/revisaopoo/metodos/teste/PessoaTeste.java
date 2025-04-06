package com.estudo.arquivos.revisao.revisaopoo.metodos.teste;

import com.estudo.arquivos.revisao.revisaopoo.metodos.dominio.Imprimir;
import com.estudo.arquivos.revisao.revisaopoo.metodos.dominio.Referencia;

public class PessoaTeste {
    public static void main(String[] args) {
        Referencia pessoa1 = new Referencia();
        Referencia pessoa2 = new Referencia();
        Imprimir impressora = new Imprimir();

        pessoa1.nome = "Trunks";
        pessoa1.idade = 19;
        pessoa1.sexo = 'M';

        pessoa2.nome = "Bulma";
        pessoa2.idade = 45;
        pessoa2.sexo = 'F';

        impressora.imprime(pessoa1);
        impressora.imprime(pessoa2);

    }
}
