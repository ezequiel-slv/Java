package com.estudo.arquivos.revisao.revisaopoo.arrayobjetos.dominio;

public class Carro {
    private final String marca;
    private int ano;

    public Carro(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    public void imprimeCarro(){
        System.out.println("Marca do carro: " + marca);
        System.out.println("Ano do carro: " + ano);
        System.out.println("---------------");
    }

    public void setAno(int ano){
        this.ano = ano;
    }
}
