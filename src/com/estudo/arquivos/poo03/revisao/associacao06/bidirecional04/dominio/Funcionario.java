package com.estudo.arquivos.poo03.revisao.associacao06.bidirecional04.dominio;

public class Funcionario {
    private String nome;
    private Empresa empresa;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public void imprimir(){
        System.out.println("Funcionario: " + this.nome);
        if (empresa != null){
            System.out.println("Empresa: " + empresa.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}
