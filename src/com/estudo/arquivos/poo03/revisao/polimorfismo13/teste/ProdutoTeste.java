package com.estudo.arquivos.poo03.revisao.polimorfismo13.teste;

import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio.Mochila;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio.Produto;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio.Tomate;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.repositorio.Repositorio;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.service.CalcularImposto;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.service.SaveBD;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.service.SaveMemory;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto = new Mochila("Sport Line", 400);
        CalcularImposto.ImpostoProduto(produto);

        Repositorio repositorio01 = new SaveBD();
        repositorio01.salvar();

        System.out.println("----------");

        Produto tomate = new Tomate("Tomate americano", 20, "03/07/2022");
        CalcularImposto.ImpostoProduto(tomate);
        Repositorio repositorio02 = new SaveMemory();
        repositorio02.salvar();


    }
}
