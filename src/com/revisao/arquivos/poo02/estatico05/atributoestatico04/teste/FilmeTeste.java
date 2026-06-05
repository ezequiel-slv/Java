package com.revisao.arquivos.poo02.estatico05.atributoestatico04.teste;

import com.revisao.arquivos.poo02.estatico05.atributoestatico04.dominio.Filme;

public class FilmeTeste {
    public static void main(String[] args) {
        Filme filme = new Filme("Transformers: A Vingança dos Derrotados", "2 horas e 30 minutos");

        Filme.setClassificacao("Ação");
        filme.imprimme();
    }
}
