package com.estudo.arquivos.poo.revisao.associacao06.umparamuitos02.dominio;

public class Estado {
    private String nome;
    private Pais pais;

    public Estado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
