package com.revisao.arquivos.poo02.introducaoclasses01.dominio;

import java.time.LocalDate;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;

    public void imrprime(){
        System.out.println("---------");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Marca: " + getMarca());
        System.out.println("Ano: " + getAno());
        System.out.println("Carro " + getModelo() + " é novo? " + ehNovo());
        System.out.println("Idade do carro: " + idadeCarro() + " anos");
    }

    public boolean ehNovo(){
         return getAno() >= LocalDate.now().getYear();

    }

    public int idadeCarro(){
        return LocalDate.now().getYear() - getAno();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 1900){
            System.out.println("Valor inválido");
            return;
        }
        this.ano = ano;
    }
}
