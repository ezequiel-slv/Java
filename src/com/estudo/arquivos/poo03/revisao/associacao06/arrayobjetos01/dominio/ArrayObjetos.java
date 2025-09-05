package com.estudo.arquivos.poo03.revisao.associacao06.arrayobjetos01.dominio;

public class ArrayObjetos {
    private String pais;

    public void imprime(){
        System.out.println("País: " + this.pais);
    }
    public ArrayObjetos(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
