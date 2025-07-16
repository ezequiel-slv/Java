package com.estudo.arquivos.poo.revisao.estatico05.modificadorestatico02.dominio;

public class Estacionamento {
    private static int vagasOcupadas;
    private static final int totalVagas = 100;

    public Estacionamento() {
        if (vagasOcupadas < totalVagas){
            vagasOcupadas++;
            System.out.println(vagasOcupadas);
        }else {
            System.out.println("Estacionamento cheio");
        }
    }

    public void sair(){
        if (vagasOcupadas > 0){
            vagasOcupadas--;
            System.out.println(vagasOcupadas);
        }

    }
}
