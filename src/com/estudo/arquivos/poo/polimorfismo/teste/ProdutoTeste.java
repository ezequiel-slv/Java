package com.estudo.arquivos.poo.polimorfismo.teste;

import com.estudo.arquivos.poo.polimorfismo.dominio.Celular;
import com.estudo.arquivos.poo.polimorfismo.dominio.Computador;
import com.estudo.arquivos.poo.polimorfismo.servico.CalcularImposto;

public class ProdutoTeste {
    public static void main(String[] args) {
        Computador computador = new Computador("Acer Aspire 5 I5", 3000);
        Celular celular = new Celular("Samsung Galaxy S23", 5300);
        CalcularImposto.calcularImpostoComputador(computador);
        System.out.println("-----------");
        CalcularImposto.calcularImpostoCelular(celular);
    }
}
