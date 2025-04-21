package com.estudo.arquivos.poo.construtores.teste;
//Sobrecarga de construtores
import com.estudo.arquivos.poo.construtores.dominio.Anime02;

public class AnimeTeste02 {
    public static void main(String[] args) {
        Anime02 anime = new Anime02("Kimetsu No Yaiba", 117, "Anime", "Ação, Drama, Sobrenatural", "Ufotable");

        anime.imprime();
    }
}
