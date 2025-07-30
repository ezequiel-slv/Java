package com.estudo.arquivos.poo.revisao.enumeracao10.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    private Empresa empresa;
    private Setor setor;


    public void imprimir(){
        super.imprimir();
        System.out.println("Nome da empresa: " + empresa.getNome());
        System.out.println("Setor: " + setor);
        System.out.println("Salário: " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
}
