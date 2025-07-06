package com.estudo.arquivos.poo.corepoo.polimorfismo13.servico;

import com.estudo.arquivos.poo.corepoo.polimorfismo13.dominio.Feijao;
import com.estudo.arquivos.poo.corepoo.polimorfismo13.dominio.Produto;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        if (produto instanceof Feijao) {
            System.out.println("Data de validade: " + ((Feijao) produto).getDataValidade());
        }
    }
}
