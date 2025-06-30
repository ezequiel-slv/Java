package com.estudo.arquivos.poo.src.heranca08.dominio;

public class Dia {
    private String dia;


    public Dia(String dia) {
        this.dia = dia;
    }

    public void imprime(){
        System.out.println(this.dia);
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}
