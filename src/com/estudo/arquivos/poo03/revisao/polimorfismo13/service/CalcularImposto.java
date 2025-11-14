package com.estudo.arquivos.poo03.revisao.polimorfismo13.service;

import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio.Fone;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio.Garrafa;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio.Mochila;

public class CalcularImposto {
    public static void ImpostoFone(Fone fone){
        double imposto = fone.calculaImposto();
        System.out.println("Produto: " + fone.getNome());
        System.out.println("Valor: " + fone.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        System.out.println("----------");
    }

    public static void ImpostoGarrafa(Garrafa garrafa){
        double imposto = garrafa.calculaImposto();
        System.out.println("Produto: " + garrafa.getNome());
        System.out.println("Valor: " + garrafa.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        System.out.println("----------");
    }

    public static void ImpostoMochila(Mochila mochila){
        double imposto = mochila.calculaImposto();
        System.out.println("Produto: " +  mochila.getNome());
        System.out.println("Valor: " +  mochila.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        System.out.println("----------");
    }
}
