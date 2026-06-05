package com.revisao.arquivos.poo02.estatico05.inicializacaoestatico02.teste;

import com.revisao.arquivos.poo02.estatico05.inicializacaoestatico02.dominio.Filme;

public class FilmeTeste {
    public static void main(String[] args) {
        Filme filme = new Filme("Inception (A Origem)", "148 minutos", "14 anos");
        filme.imprime();
    }
}
