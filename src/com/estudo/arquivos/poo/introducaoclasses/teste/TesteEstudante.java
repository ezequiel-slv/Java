package com.estudo.arquivos.poo.introducaoclasses.teste;

import com.estudo.arquivos.poo.introducaoclasses.dominio.Estudante;

public class TesteEstudante {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 22;
        estudante.nome = "Ezequiel";
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
