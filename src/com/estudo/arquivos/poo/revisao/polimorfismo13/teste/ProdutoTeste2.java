package com.estudo.arquivos.poo.revisao.polimorfismo13.teste;

import com.estudo.arquivos.poo.revisao.polimorfismo13.dominio.Celular;
import com.estudo.arquivos.poo.revisao.polimorfismo13.dominio.Computador;
import com.estudo.arquivos.poo.revisao.polimorfismo13.dominio.Margarina;
import com.estudo.arquivos.poo.revisao.polimorfismo13.dominio.Produto;
import com.estudo.arquivos.poo.revisao.polimorfismo13.service.CalculadoraImposto;

public class ProdutoTeste2 {
    public static void main(String[] args) {
        Produto celular = new Celular("Iphone 16 PRO", 8932);
        CalculadoraImposto.calcularImposto(celular);
        System.out.println("--------------");
        Produto computador = new Computador("Notebook Samsung Galaxy Book4", 3681);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------");
        Margarina margarina = new Margarina("Margarina Primor 500g", 12);
        margarina.setDataValidade("09/10/2025");
        CalculadoraImposto.calcularImposto(margarina);
        }
    }
