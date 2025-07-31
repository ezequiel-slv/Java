package com.estudo.arquivos.poo.revisao.enumeracao10.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    private Empresa empresa;
    private Setor setor;


    public void imprimir(){
        super.imprimir();
        String saida = empresa != null? empresa.getNome() : "Nome da empresa não informado";
        System.out.println("Nome da empresa: " + saida);
        String saida2 = setor != null? setor.toString() : "Nome do setor não informado";
        System.out.println(saida2);
        String saida3 = salario != 0.0? String.valueOf(salario) : "Salário não informado";
        System.out.println("Salário: " + saida3);
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
