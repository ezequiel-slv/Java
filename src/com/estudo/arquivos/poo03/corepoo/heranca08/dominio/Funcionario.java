package com.estudo.arquivos.poo03.corepoo.heranca08.dominio;

public class Funcionario extends Pessoa {
    private double salario;


    public void imprime(){
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

    public void imprime2(){
        System.out.println("Eu " + this.nome + " recebi " + this.salario );
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
