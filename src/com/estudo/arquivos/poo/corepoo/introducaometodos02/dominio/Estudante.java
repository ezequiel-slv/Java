package com.estudo.arquivos.poo.corepoo.introducaometodos02.dominio;

public class Estudante {
    public String nome;
    public int idade ;
    public char sexo = 'M';

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
