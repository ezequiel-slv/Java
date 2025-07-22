package com.estudo.arquivos.poo.revisao.heranca08.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    public void imprimir(){
        System.out.println("------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " +  endereco.getRua() + " | " + "Cep: " + endereco.getCep());
        System.out.println("Salário; " + this.salario);
    }

    public void imprimir2(){
        super.imprimir2();
        System.out.println("Salário; " + this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
