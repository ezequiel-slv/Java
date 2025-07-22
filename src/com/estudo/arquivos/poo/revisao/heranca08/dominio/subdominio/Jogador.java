package com.estudo.arquivos.poo.revisao.heranca08.dominio.subdominio;

public class Jogador extends Pessoa2{
    private Time time;
    private double salario;

    public Jogador(String nome, int idade, char sexo, String cpf) {
        super(nome, idade, sexo, cpf);
    }

    public Jogador(String nome, int idade, char sexo, String cpf, double salario) {
        this(nome, idade, sexo, cpf);
        this.salario = salario;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Time: " + time.getnome());
        System.out.println("Posição do jogador: " + time.getPosicao());
        System.out.println("Salário: " + this.salario);
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
