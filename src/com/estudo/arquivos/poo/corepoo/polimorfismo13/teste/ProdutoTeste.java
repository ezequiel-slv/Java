package com.estudo.arquivos.poo.corepoo.polimorfismo13.teste;

import com.estudo.arquivos.poo.corepoo.polimorfismo13.dominio.Celular;
import com.estudo.arquivos.poo.corepoo.polimorfismo13.dominio.Computador;
import com.estudo.arquivos.poo.corepoo.polimorfismo13.dominio.Feijao;
import com.estudo.arquivos.poo.corepoo.polimorfismo13.dominio.Produto;
import com.estudo.arquivos.poo.corepoo.polimorfismo13.servico.CalculadoraImposto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto1 = new Computador("Acer Aspire 5 I5", 3000);
        CalculadoraImposto.calcularImposto(produto1);
        System.out.println("--------");
        Produto produto2 = new Celular("Samsung Galaxy S23 ultra", 5000);
        CalculadoraImposto.calcularImposto(produto2);
        System.out.println("--------");
        Feijao produto3 = new Feijao("Feijão Carioca", 8);
        produto3.setDataValidade("08/07/2025");
        CalculadoraImposto.calcularImposto(produto3);
    }
}