package com.estudo.arquivos.poo03.revisao.heranca08.teste;

import com.estudo.arquivos.poo03.revisao.heranca08.dominio.subdominio5.Gerente;
import com.estudo.arquivos.poo03.revisao.heranca08.dominio.subdominio5.Vendedor;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João", "9813489327", 4000);
        gerente.calcSalario();
        gerente.imprimir();

        System.out.println("------");

        Vendedor vendedor = new Vendedor("Mario", "56392342345", 2500);
        vendedor.calcSalario();
        vendedor.imprimir();
    }
}
