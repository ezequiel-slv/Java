package com.estudo.arquivos.revisao.revisaopoo.metodos.dominio;

public class Imprimir {

    public void imprime (Referencia pessoa){
        System.out.println("--------------");

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.sexo);
    }
}
