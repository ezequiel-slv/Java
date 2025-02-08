package com.estudo.arquivos.poo.introducaometodos.test;

import com.estudo.arquivos.poo.introducaometodos.dominio.Estudante;
import com.estudo.arquivos.poo.introducaometodos.dominio.ImprimeEstudante;

public class TesteEstudante01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImprimeEstudante impressora = new ImprimeEstudante();

        estudante01.nome = "João";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Joana";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
