package com.estudo.arquivos.poo.revisao.associacao06.dominio;

public class RelUmParaUm1 {
    private String estado;
    private RelUmParaUm2 pais;

    public void imprimir(){
        if (pais != null){
            System.out.println("País: " + pais.getPais());
        }
        System.out.println("Estado: " + this.estado);
    }
    public RelUmParaUm1(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public RelUmParaUm2 getPais() {
        return pais;
    }

    public void setPais(RelUmParaUm2 pais) {
        this.pais = pais;
    }
}
