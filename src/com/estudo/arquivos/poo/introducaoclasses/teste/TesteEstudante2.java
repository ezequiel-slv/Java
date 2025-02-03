package com.estudo.arquivos.poo.introducaoclasses.teste;

import com.estudo.arquivos.poo.introducaoclasses.dominio.Estudante;

public class TesteEstudante2 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante2.nome = "Ezy";
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println("-----------");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
