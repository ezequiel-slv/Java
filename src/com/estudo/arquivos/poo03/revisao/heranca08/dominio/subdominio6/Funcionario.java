package com.estudo.arquivos.poo03.revisao.heranca08.dominio.subdominio6;

public class Funcionario extends Pessoa implements desconto{
    protected double salario;
    public final double desconto = 0.10;

    public Funcionario(String nome, int idade, String sexo, double salario) {
        super(nome, idade, sexo);
        this.salario = salario;
    }

    @Override
    public double calcularDesconto() {
        return this.salario * desconto;
    }

    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Salário: " + this.salario);
        System.out.println("Desconto do salário: " + calcularDesconto());
    }
}
