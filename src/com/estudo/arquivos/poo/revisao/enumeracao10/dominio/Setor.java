package com.estudo.arquivos.poo.revisao.enumeracao10.dominio;

public enum Setor {
    MARKETING("Marketing"),
    TI("Tecnologia DA Informação"),
    RH("Recursos Humanos"),
    FINANCEIRO("Financeiro"),
    ;

    private final String enumFormat;

    Setor(String enumFormat) {
        this.enumFormat = enumFormat;
    }

    @Override
    public String toString() {
        return "Setor: " + enumFormat;
    }
}
