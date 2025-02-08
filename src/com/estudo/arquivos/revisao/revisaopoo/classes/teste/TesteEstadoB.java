package com.estudo.arquivos.revisao.revisaopoo.classes.teste;

import com.estudo.arquivos.revisao.revisaopoo.classes.dominio.Estados;

public class TesteEstadoB {
    public static void main(String[] args) {
        Estados estadoB = new Estados();

        String nome = "Rio De Janeiro";
        double populacao = 6_211_423.0;
        int municipios = 92;

        System.out.println("Nome: " + nome);
        System.out.println("População: " + populacao);
        System.out.println("Quantidade de municipios: " + municipios);
    }
}
