package com.estudo.arquivos.poo.associacao.bidirecional.teste;

import com.estudo.arquivos.poo.associacao.bidirecional.dominio.Jogador;
import com.estudo.arquivos.poo.associacao.bidirecional.dominio.Time;

public class JogadorTeste {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Romário");
        Jogador jogador2 = new Jogador("Ronaldinho");
        Jogador[] jogadores = {jogador1, jogador2};
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- jogador ---");

        jogador1.imprime();
        jogador2.imprime();

        System.out.println("--- time ---");

        time.imprime();

    }
}
