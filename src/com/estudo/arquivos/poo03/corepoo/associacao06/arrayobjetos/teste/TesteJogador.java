package com.estudo.arquivos.poo03.corepoo.associacao06.arrayobjetos.teste;

import com.estudo.arquivos.poo03.corepoo.associacao06.arrayobjetos.dominio.Jogador;

public class TesteJogador {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cristiano Ronaldo");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("Neymar");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            jogador.imprime();
        }

    }
}
