package com.estudo.arquivos.poo03.revisao.polimorfismo13.service;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio.Margarina;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio.Produto;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        double imposto = produto.calcularImposto();
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Valor do produto: " + produto.getValor());
        System.out.printf("Imposto a ser pago: %.2f\n", imposto);

        if (produto instanceof Margarina margarina){
            System.out.println("Data de validade: " + margarina.getDataValidade());
        }
    }
}
