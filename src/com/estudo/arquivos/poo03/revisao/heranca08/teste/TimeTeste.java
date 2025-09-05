package com.estudo.arquivos.poo03.revisao.heranca08.teste;

import com.estudo.arquivos.poo03.revisao.heranca08.dominio.subdominio.Jogador;
import com.estudo.arquivos.poo03.revisao.heranca08.dominio.subdominio.Time;

public class TimeTeste {
    public static void main(String[] args) {
        Time time1 = new Time();
        time1.setnome("Flamengo");
        time1.setPosicao("Meio campista");

        Jogador jogador1 = new Jogador("Giorgian De Arrascaeta", 31, 'M', "32435456568", 1_100_000);
        jogador1.setTime(time1);
        jogador1.imprimir();
    }
}
