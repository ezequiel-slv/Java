package com.estudo.arquivos.revisao.revisaopoo.classes.teste;

import com.estudo.arquivos.revisao.revisaopoo.classes.dominio.Referencia;

public class TesteRefencia {
    public static void main(String[] args) {
        Referencia ciclano = new Referencia();
        Referencia fulano = new Referencia();

        fulano.nome = "fulano";
        fulano.idade = 20;
        fulano.sexo = 'M';

        ciclano.nome = "ciclano";
        ciclano.idade = 15;
        ciclano.sexo = 'F';

        fulano = ciclano;

        System.out.println(ciclano.nome);
        System.out.println(ciclano.idade);
        System.out.println(ciclano.sexo);

        System.out.println(fulano.nome);
        System.out.println(fulano.idade);
        System.out.println(fulano.sexo);

    }
}
