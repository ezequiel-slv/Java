package com.estudo.arquivos.revisao.revisaopoo.associacao.dominio;

public class Empresa {
    private String nome;
    private Funcionario[] funcionarios;

    public Empresa(String nome){
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        if (funcionarios != null) {
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario.getNome());
            }
        }
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
