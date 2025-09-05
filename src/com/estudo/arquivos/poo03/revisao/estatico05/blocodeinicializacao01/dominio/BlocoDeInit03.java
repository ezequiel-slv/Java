package com.estudo.arquivos.poo03.revisao.estatico05.blocodeinicializacao01.dominio;

public class BlocoDeInit03 {
    private String rotulo = "---Garagem---";
    private String carro;
    private String modelo;

    {
        System.out.println(rotulo);
    }
    public void imorime(){
        System.out.println("Carro: " + this.carro);
        System.out.println("modelo: " + this.modelo);
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public String getmodelo() {
        return modelo;
    }

    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }
}
