package com.estudo.arquivos.poo03.corepoo.introducaoclasses01.teste;

import com.estudo.arquivos.poo03.corepoo.introducaoclasses01.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.modelo = "Honda Civic 2024";
        carro1.marca = "Honda";
        carro1.ano = 2024;

        carro2.modelo = "Corolla 2025 GLI";
        carro2.marca = "Toyota";
        carro2.ano = 2025;
        System.out.println("Carro 1");
        System.out.println(carro1.modelo + ", Marca: " +  carro1.marca + ", Ano: " + carro1.ano);
        System.out.println("Carro 2");
        System.out.println( carro2.modelo + ", Marca: " +  carro2.marca + ", Ano: " + carro2.ano);
    }
}
