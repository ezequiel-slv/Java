package com.estudo.arquivos.poo.revisao.associacao06.teste;

import com.estudo.arquivos.poo.revisao.associacao06.dominio.RelUmParaUm1;
import com.estudo.arquivos.poo.revisao.associacao06.dominio.RelUmParaUm2;

public class RelUmParaUmTeste {
    public static void main(String[] args) {
        RelUmParaUm1 estado = new RelUmParaUm1("Maranhão");
        RelUmParaUm2 pais = new RelUmParaUm2("Brasil");

        estado.setPais(pais);

        estado.imprimir();
    }
}
