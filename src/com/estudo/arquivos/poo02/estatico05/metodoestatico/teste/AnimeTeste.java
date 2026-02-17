package com.estudo.arquivos.poo02.estatico05.metodoestatico.teste;

import com.estudo.arquivos.poo02.estatico05.metodoestatico.dominio.Anime;

public class AnimeTeste {

    public static void main(String[] args) {

        Anime.setTipo("Shounem");

        Anime anime1 = new Anime("Dragon Ball Z", 291);
        Anime anime2 = new Anime("One Piece", 220);
        Anime anime3 = new Anime("Naruto", 1100);

        anime1.imprime();
        anime2.imprime();
        anime3.imprime();
    }
}
