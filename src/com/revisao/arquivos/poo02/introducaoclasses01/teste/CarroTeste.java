package com.revisao.arquivos.poo02.introducaoclasses01.teste;

import com.revisao.arquivos.poo02.introducaoclasses01.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        carro1.setModelo("Civic Touring");
        carro1.setMarca("Honda");
        carro1.setAno(2024);

        carro2.setModelo("Corolla GLI");
        carro2.setMarca("Toyota");
        carro2.setAno(2023);

        carro3.setModelo("Onix LT");
        carro3.setMarca("Chevrolet");
        carro3.setAno(2022);

        carro1.imrprime();

        carro2.imrprime();

        carro3.imrprime();
    }
}
