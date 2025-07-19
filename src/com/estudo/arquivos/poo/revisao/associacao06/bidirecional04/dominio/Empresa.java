package com.estudo.arquivos.poo.revisao.associacao06.bidirecional04.dominio;

public class Empresa {
    private String nome;
    private final Funcionario[] funcionarios;

    public Empresa(String nome, Funcionario[] funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public void imprimir(){
        System.out.println("Empresa: " + this.nome);
        if (funcionarios == null)return;
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Funcionario: " + funcionario.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
