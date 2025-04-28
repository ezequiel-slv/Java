package com.estudo.arquivos.revisao.revisaopoo.arrayobjetos.dominio;

public class Funcionario {
    private final String nome;
    private final double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.printf("Salário: %.3fR$\n", salario);
    }

    public void acrescimo(){
        double acresc = salario + (salario * 1.15);
        System.out.printf("Salário com acrescimo: %.3fR$\n", acresc);
    }
}
