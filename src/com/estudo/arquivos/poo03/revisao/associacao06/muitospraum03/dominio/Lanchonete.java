package com.estudo.arquivos.poo03.revisao.associacao06.muitospraum03.dominio;

public class Lanchonete {
    private String nome;
    private final Funcionario [] funcionario;

    public Lanchonete(String nome, Funcionario[] funcionario) {
        this.nome = nome;
        this.funcionario = funcionario;
    }

    public void imprimir(){
        System.out.println("Lanchonete: " + this.nome);
        if (funcionario == null) return;
        for (Funcionario funcionario1 : funcionario) {
            System.out.println("Funcionário: " + funcionario1.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
