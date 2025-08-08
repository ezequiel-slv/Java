package com.estudo.arquivos.poo.revisao.polimorfismo13.teste;

import com.estudo.arquivos.poo.revisao.polimorfismo13.dominio.Celular;
import com.estudo.arquivos.poo.revisao.polimorfismo13.dominio.Computador;
import com.estudo.arquivos.poo.revisao.polimorfismo13.service.CalculadoraImposto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Celular celular = new Celular("Iphone 16 PRO", 8932);
        Computador computador = new Computador("Notebook Samsung Galaxy Book4", 3681);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------");
        CalculadoraImposto.calcularImposto(celular);
    }
}
