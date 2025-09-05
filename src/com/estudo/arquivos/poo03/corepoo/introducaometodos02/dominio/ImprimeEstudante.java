package com.estudo.arquivos.poo03.corepoo.introducaometodos02.dominio;

public class ImprimeEstudante {

    public void imprime(Estudante estudante){
        System.out.println("-------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

       estudante.nome = "Mario";
    }
}
