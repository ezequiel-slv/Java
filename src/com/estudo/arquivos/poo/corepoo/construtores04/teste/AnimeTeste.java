package com.estudo.arquivos.poo.corepoo.construtores04.teste;

import com.estudo.arquivos.poo.corepoo.construtores04.dominio.Anime;
//Construtores
public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime("Kimetsu No Yaiba", 117, "Anime", "Ação, Drama, Sobrenatural");
        Anime anime2 = new Anime();

        anime.imprime();
        anime2.imprime();
    }
}
