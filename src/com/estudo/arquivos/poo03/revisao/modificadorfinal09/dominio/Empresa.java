package com.estudo.arquivos.poo03.revisao.modificadorfinal09.dominio;

public class Empresa {
    private static final String NOME = "Journey Consultancy";
    public final Funcionario FUNCIONARIO = new Funcionario();

    static {
        System.out.println("Empresa: " + NOME);
    }
}
