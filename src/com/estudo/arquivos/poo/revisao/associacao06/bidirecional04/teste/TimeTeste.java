package com.estudo.arquivos.poo.revisao.associacao06.bidirecional04.teste;

import com.estudo.arquivos.poo.revisao.associacao06.bidirecional04.dominio.Jogador;
import com.estudo.arquivos.poo.revisao.associacao06.bidirecional04.dominio.Time;

public class TimeTeste {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Arrascaeta");
        Jogador jogador2 = new Jogador("Jorginho");
        Jogador jogador3 = new Jogador("Plata");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        Time time = new Time("Flamengo", jogadores);

        for (Jogador jogador : jogadores) {
            jogador.setTime(time);
            System.out.println(jogador.getNome());
        }

        System.out.println("-------");

        time.imprimir();

    }
}
