package com.estudo.arquivos.poo03.revisao.classesabstratas11.dominio4;

public enum Cargo {
    GERENTE("Gerente"),
    DESENVOLVEDOR("Desenvolvedor"),
    ESTAGIARIO("Estagiário");

    private String nomeCargo;

    Cargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }
}
