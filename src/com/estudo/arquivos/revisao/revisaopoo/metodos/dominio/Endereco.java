package com.estudo.arquivos.revisao.revisaopoo.metodos.dominio;

public class Endereco {
    public String cidade;
    public String rua;
    public int numero;

    public void imprime(){

        System.out.println("----------");

        System.out.println(this.cidade);
        System.out.println(this.rua);
        System.out.println(this.numero);
    }
}
