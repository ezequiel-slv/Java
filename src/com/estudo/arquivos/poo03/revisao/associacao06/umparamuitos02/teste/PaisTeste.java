package com.estudo.arquivos.poo03.revisao.associacao06.umparamuitos02.teste;

import com.estudo.arquivos.poo03.revisao.associacao06.umparamuitos02.dominio.Estado;
import com.estudo.arquivos.poo03.revisao.associacao06.umparamuitos02.dominio.Pais;

public class PaisTeste {
    public static void main(String[] args) {
        Estado estado = new Estado("Maranhão");
        Estado estado2 = new Estado("São Paulo");
        Pais pais = new Pais("Brasil");

        pais.addEstados(estado);
        pais.addEstados(estado2);

        System.out.println(pais.getNome());
        for (Estado estados : pais.getEstados()){
            System.out.println(estados.getNome());
        }

        System.out.println("----");

        System.out.println(estado2.getNome() + " fica no " + pais.getNome());
        System.out.println(estado.getNome() + " fica no " + pais.getNome());
    }
}
