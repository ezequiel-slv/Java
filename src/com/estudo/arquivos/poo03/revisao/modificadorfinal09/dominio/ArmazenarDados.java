package com.estudo.arquivos.poo03.revisao.modificadorfinal09.dominio;

public class ArmazenarDados {
    private String comandoCreate;

    public String getComandoCreate() {
        return comandoCreate;
    }

    public void setComandoCreate(String comandoCreate) {
        this.comandoCreate = comandoCreate;
    }

    public void imprimir(){
        System.out.println(comandoCreate);
    }

    @Override
    public String toString() {
        return comandoCreate;
    }
}
