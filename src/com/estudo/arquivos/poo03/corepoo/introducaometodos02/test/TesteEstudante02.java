package com.estudo.arquivos.poo03.corepoo.introducaometodos02.test;

import com.estudo.arquivos.poo03.corepoo.introducaometodos02.dominio.Estudante;

public class TesteEstudante02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        estudante01.nome = "João";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Joana";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
