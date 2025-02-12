package com.estudo.arquivos.revisao.exercicos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double salario;
    public double salario2;
    public double salario3;
    public int media;

    public void imprimeSalario(){
        System.out.println("--Dados do funcionario--");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(salario);
        System.out.println(salario2);
        System.out.println(salario3);
    }

    public void imprimeMediaSalario(){
        System.out.println("--Média dos salarios do funcionario--");
        System.out.println(media);
    }

}
