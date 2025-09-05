package com.estudo.arquivos.poo03.corepoo.estatico05.modificadoresestatico.teste;

import com.estudo.arquivos.poo03.corepoo.estatico05.modificadoresestatico.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Dragon Ball Z", 291);
        Anime anime2 = new Anime("One Piece", 220);
        Anime anime3 = new Anime("Naruto", 1100);

        Anime.tipo = "Shounem";
        anime1.imprime();
        anime2.imprime();
        anime3.imprime();
    }
}
