package com.estudo.arquivos.poo.polimorfismo.servico;

import com.estudo.arquivos.poo.polimorfismo.dominio.Celular;
import com.estudo.arquivos.poo.polimorfismo.dominio.Computador;

public class CalcularImposto {
    public static void calcularImpostoComputador(Computador computador){
        double imposto = computador.calcularImposto();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Imposto a ser pagp: " + imposto);
    }

    public static void calcularImpostoCelular(Celular celular){
        double imposto = celular.calcularImposto();
        System.out.println("Celular: " + celular.getNome());
        System.out.println("Valor: " + celular.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
