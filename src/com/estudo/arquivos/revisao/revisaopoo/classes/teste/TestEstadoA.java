package com.estudo.arquivos.revisao.revisaopoo.classes.teste;

import com.estudo.arquivos.revisao.revisaopoo.classes.dominio.Estados;

public class TestEstadoA {
    public static void main(String[] args) {
        Estados estado = new Estados();

        String nome = "Maranhão";
        double populacao = 7_500_000.0;
        int municipios = 217;

        System.out.println("Nome: " + nome);
        System.out.println("População: " + populacao);
        System.out.println("Quantidade de municipios: " + municipios);
    }
}
