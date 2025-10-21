package com.estudo.arquivos.poo03.revisao.enumeracao10.teste;

import com.estudo.arquivos.poo03.revisao.enumeracao10.dominio.Compra;
import com.estudo.arquivos.poo03.revisao.enumeracao10.dominio.StatusCompra;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra("Iphone 17 Pro Max", 16.500, StatusCompra.ENVIADO);
        compra1.imprime();
    }
}
