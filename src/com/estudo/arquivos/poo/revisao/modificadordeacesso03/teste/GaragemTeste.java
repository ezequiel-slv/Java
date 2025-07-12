package com.estudo.arquivos.poo.revisao.modificadordeacesso03.teste;

import com.estudo.arquivos.poo.revisao.modificadordeacesso03.dominio.Garagem;

public class GaragemTeste {
    public static void main(String[] args) {
        Garagem garagem = new Garagem();
        garagem.init("Civic", 2020, "SUV", "Preto");
        garagem.imprimir();
    }
}
