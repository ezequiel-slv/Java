package com.estudo.arquivos.revisao.revisaopoo.associacao.dominio;

public class Empresa {
    private String nome;
    private Funcionario[] funcionarios;

    public Empresa(String nome){
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setFuncionarios(Funcionario[] funcionarios){
        this.funcionarios = funcionarios;
        for (Funcionario funcionario : funcionarios) {
            funcionario.setEmpresa(this);
        }
    }

}
