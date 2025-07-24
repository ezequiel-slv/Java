package com.estudo.arquivos.poo.revisao.heranca08.dominio.subdominio3;

public class Funcionario extends Pessoa{
    private String matricula;
    private double salario;

    public void imprimir(){
        super.imprimir();
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Salário: " + this.salario);
    }
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
