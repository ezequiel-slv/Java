package com.estudo.arquivos.poo.introducaometodos.dominio;

public class ImprimeEstudante {

    public void imprime(Estudante estudante){
        System.out.println("-------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

       estudante.nome = "Mario";
    }
}
