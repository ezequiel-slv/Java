package com.estudo.arquivos.poo.src.heranca08.dominio;

public class Semana extends Dia {
    private String semana;


    public Semana(String dia) {
        super(dia);
    }

    public void imprime(){
        System.out.println(this.semana);
        super.imprime();
    }

    public String getSemana() {
        return semana;
    }

    public void setSemana(String semana) {
        this.semana = semana;
    }
}
