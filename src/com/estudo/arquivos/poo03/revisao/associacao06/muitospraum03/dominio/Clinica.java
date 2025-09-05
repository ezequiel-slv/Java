package com.estudo.arquivos.poo03.revisao.associacao06.muitospraum03.dominio;

public class Clinica {
    private String nome;
    private final Medico[] medicos;

    public Clinica(String nome, Medico[] medicos) {
        this.nome = nome;
        this.medicos = medicos;
    }

    public void imprimir(){
        System.out.println("Clinica: " + this.nome);
        if (medicos == null)return;
        for (Medico medico : medicos) {
            System.out.println("Médico: " + medico.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
