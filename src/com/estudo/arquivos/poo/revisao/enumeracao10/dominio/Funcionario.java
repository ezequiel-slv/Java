package com.estudo.arquivos.poo.revisao.enumeracao10.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    private Empresa empresa;
    private final Setor setor;


    public void imprimir(){
        super.imprimir();
        String saida = empresa != null? empresa.toString(): "Nome da empresa não informado";
        System.out.println("Nome da empresa: " + saida);
        String saida2 = setor != null? setor.toString() : "Nome do setor não informado";
        System.out.println(saida2);
        String saida3 = salario != 0.0? String.valueOf(salario) : "Salário não informado";
        System.out.println("Salário: " + saida3);
    }

    public Funcionario(String nome, int idade, String cpf, char sexo, double salario, Empresa empresa, Setor setor) {
        super(nome, idade, cpf, sexo);
        this.salario = salario;
        this.empresa = empresa;
        this.setor = setor;
    }
}
