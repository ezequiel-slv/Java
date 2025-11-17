package com.estudo.arquivos.poo03.revisao.polimorfismo13.service;

import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio.Produto;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio.Tomate;

public class CalcularImposto {
    public static void ImpostoProduto(Produto produto){
        double imposto = produto.calculaImposto();
        System.out.println("Produto: " +  produto.getNome());
        System.out.println("Valor: " +  produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        if (produto instanceof Tomate){
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de validade: " + tomate.getDataValidade());
        }
    }
}
