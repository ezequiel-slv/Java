package com.estudo.arquivos.poo.revisao.estatico05.metodoestatico03.dominio;

public class Carro {
    private String modelo;
    private static String marca;

    static {
        System.out.println("---Carros---");
    }

    public void imprime(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Marca: " + Carro.marca);
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Carro.marca = marca;
    }
}
