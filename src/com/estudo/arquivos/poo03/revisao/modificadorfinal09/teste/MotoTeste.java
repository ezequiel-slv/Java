package com.estudo.arquivos.poo03.revisao.modificadorfinal09.teste;

import com.estudo.arquivos.poo03.revisao.modificadorfinal09.dominio.Moto;

public class MotoTeste {
    public static void main(String[] args) {
        Moto moto = new Moto();
        moto.setModelo("Honda CG 160 Titan");
        moto.setAno("2024");
        System.out.println("Velocidade limite: " + Moto.VELOCIDADE_LIMITE);
        System.out.println(moto);
    }
}
