package com.estudo.arquivos.revisao.revisaopoo.associacao.dominio;

public class Funcionario {
    private String nome;
    private Empresa empresa;

    public Funcionario(String nome){
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (empresa != null){
            System.out.println(empresa.getNome());
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setEmpresa(Empresa empresa){
        this.empresa = empresa;
    }
}
