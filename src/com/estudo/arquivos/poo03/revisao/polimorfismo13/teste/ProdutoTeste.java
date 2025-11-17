package com.estudo.arquivos.poo03.revisao.polimorfismo13.teste;

import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio.Mochila;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio.Produto;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio.Tomate;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.service.CalcularImposto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto = new Mochila("Sport Line", 400);
        CalcularImposto.ImpostoProduto(produto);

        Produto tomate = new Tomate("Tomate americano", 20, "03/07/2022");
        CalcularImposto.ImpostoProduto(tomate);
    }
}
