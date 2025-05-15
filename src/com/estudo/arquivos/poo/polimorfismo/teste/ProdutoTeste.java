package com.estudo.arquivos.poo.polimorfismo.teste;

import com.estudo.arquivos.poo.polimorfismo.dominio.Celular;
import com.estudo.arquivos.poo.polimorfismo.dominio.Computador;
import com.estudo.arquivos.poo.polimorfismo.dominio.Feijao;
import com.estudo.arquivos.poo.polimorfismo.dominio.Produto;
import com.estudo.arquivos.poo.polimorfismo.servico.CalculadoraImposto;

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