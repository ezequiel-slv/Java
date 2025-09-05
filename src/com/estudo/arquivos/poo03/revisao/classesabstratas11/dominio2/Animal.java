package com.estudo.arquivos.poo03.revisao.classesabstratas11.dominio2;

public abstract class Animal {
    protected String nome;

    public abstract void emitirSom();

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
