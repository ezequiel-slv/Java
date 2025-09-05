package com.estudo.arquivos.poo03.corepoo.heranca08.teste;

import com.estudo.arquivos.poo03.corepoo.heranca08.dominio.Semana;

public class TesteSemana {
    public static void main(String[] args) {
        Semana semana1 = new Semana("Segunda");
        Semana semana2 = new Semana("Segunda");
        Semana semana3 = new Semana("Segunda");
        Semana semana4 = new Semana("Segunda");
        Semana semana5 = new Semana("Segunda");
        Semana semana6 = new Semana("Segunda");
        Semana semana7 = new Semana("Segunda");
        Semana[] semanas = {semana1, semana1, semana2, semana3, semana4, semana5, semana6, semana7};
        for (Semana semana : semanas) {
            semana.imprime();
        }

    }
}
