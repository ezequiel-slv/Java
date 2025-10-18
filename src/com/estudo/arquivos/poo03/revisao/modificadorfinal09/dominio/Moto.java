package com.estudo.arquivos.poo03.revisao.modificadorfinal09.dominio;

public class Moto {
    private String modelo;
    private String ano;
    public static final double VELOCIDADE_LIMITE = 250;

    @Override
    public String toString() {
        return "Moto{" +
                "modelo='" + modelo + '\'' +
                ", ano='" + ano + '\'' +
                '}';
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
