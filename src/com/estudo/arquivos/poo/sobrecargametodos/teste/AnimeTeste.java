package com.estudo.arquivos.poo.sobrecargametodos.teste;

import com.estudo.arquivos.poo.sobrecargametodos.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Shingeki no Kyojin", 94, "Anime", "Drama/Suspense");
        anime.imprime();
    }
}
