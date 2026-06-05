package com.revisao.arquivos.poo02.associacao06.bidirecional04.teste;

import com.revisao.arquivos.poo02.associacao06.bidirecional04.dominio.Astronauta;
import com.revisao.arquivos.poo02.associacao06.bidirecional04.dominio.Nave;

public class NaveTeste {
    public static void main(String[] args) {
        Astronauta astronauta01 = new Astronauta("Reid Wiseman");
        Astronauta astronauta02 = new Astronauta("Victor Glover");
        Astronauta astronauta03 = new Astronauta("Christina Koch");
        Astronauta astronauta04 = new Astronauta("Jeremy Hansen");

        Astronauta[] astronautas = {astronauta01, astronauta02,  astronauta03,  astronauta04};

        Nave nave = new Nave("Orion");

        nave.setAstronautas(astronautas);

        astronauta01.setNave(nave);
        astronauta02.setNave(nave);
        astronauta03.setNave(nave);
        astronauta04.setNave(nave);

        nave.imprime();

        System.out.println("----------");

        astronauta01.imprime();
        astronauta02.imprime();
        astronauta03.imprime();
        astronauta04.imprime();
    }
}
