package com.estudo.arquivos.poo.src.construtores04.teste;
//Sobrecarga de construtores
import com.estudo.arquivos.poo.src.construtores04.dominio.Anime;
import com.estudo.arquivos.poo.src.construtores04.dominio.Anime02;

public class AnimeTeste02 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime02 anime02 = new Anime02("Kimetsu No Yaiba", 117, "Anime", "Ação, Drama, Sobrenatural", "Ufotable");

        anime02.imprime();
    }
}
