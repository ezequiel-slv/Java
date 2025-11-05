package com.estudo.arquivos.poo03.revisao.classesabstratas11.dominio4;

public enum Cargo {
    GERENTE("Gerente", 0.30),
    DESENVOLVEDOR("Desenvolvedor", 0.15),
    ESTAGIARIO("Estagiário", 0.05);

    private final String nomeCargo;
    private final double bonusCargo;

    Cargo(String nomeCargo, double bonusCargo) {
        this.nomeCargo = nomeCargo;
        this.bonusCargo = bonusCargo;
    }

    public String getNomeCargo() {
        return nomeCargo;
    }

    public double getBonusCargo() {
        return bonusCargo;
    }
}
