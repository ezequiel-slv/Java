package com.estudo.arquivos.poo02.estatico05.inicializacaoestatico.teste;

import com.estudo.arquivos.poo02.estatico05.inicializacaoestatico.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Dragon Ball Z", 291);
        Anime anime2 = new Anime("Naruto", 1100);
        Anime anime3 = new Anime("One Piece", 220);

        anime1.imprime();
        anime2.imprime();
        anime3.imprime();
    }
}
