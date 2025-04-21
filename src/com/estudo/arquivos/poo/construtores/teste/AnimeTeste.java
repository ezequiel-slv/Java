package com.estudo.arquivos.poo.construtores.teste;

import com.estudo.arquivos.poo.construtores.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime("Kimetsu No Yaiba", 117, "Anime", "Ação, Drama, Sobrenatural");
        Anime anime2 = new Anime();

        anime.imprime();
        anime2.imprime();
    }
}
