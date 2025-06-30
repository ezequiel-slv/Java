package com.estudo.arquivos.poo.src.introducaoclasses01.teste;

import com.estudo.arquivos.poo.src.introducaoclasses01.dominio.Referencia;

public class TesteReferencia {
    public static void main(String[] args) {
        Referencia estado = new Referencia();
        Referencia municipio = new Referencia();

        estado.referencia = "Maranhão";
        municipio.referencia = "Imperatriz";

        estado = municipio;

        System.out.println(municipio.referencia);
    }
}
