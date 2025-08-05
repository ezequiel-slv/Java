package com.estudo.arquivos.poo.revisao.modificadorfinal09.dominio;

public class Pessoa {
    private String nome;
    private String dataNasc;
    private String cpf;
    private char sexo;

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Data Nascimento: " + this.dataNasc);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Sexo: " + this.sexo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
