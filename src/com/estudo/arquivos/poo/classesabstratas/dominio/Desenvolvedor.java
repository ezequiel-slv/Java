package com.estudo.arquivos.poo.classesabstratas.dominio;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, String linguagem) {
        super(nome, linguagem);
    }

    @Override
    public String toString() {
        return "Desenvolvedor: " + nome + " | " + "Linguagem: " + linguagem;
    }
}
