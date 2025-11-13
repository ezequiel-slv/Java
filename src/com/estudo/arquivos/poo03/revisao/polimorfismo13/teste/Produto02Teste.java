package com.estudo.arquivos.poo03.revisao.polimorfismo13.teste;

import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio5.Fone;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio5.Garrafa;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio5.Mochila;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.service5.CalcularImposto;

public class Produto02Teste {
    public static void main(String[] args) {
        Mochila mochila = new Mochila("Mochila Urban Pro", 149.90);
        Fone fone = new Fone("Fone Bluetooth SoundMax", 89.00);
        Garrafa garrafa = new Garrafa("Garrafa Térmica Steel 500ml", 59.90);

        CalcularImposto.ImpostoMochila(mochila);
        CalcularImposto.ImpostoGarrafa(garrafa);
        CalcularImposto.ImpostoFone(fone);
    }
}
