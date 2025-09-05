package com.estudo.arquivos.poo03.revisao.heranca08.teste;

import com.estudo.arquivos.poo03.revisao.heranca08.dominio.subdominio3.Gerente;

public class PessoaTeste2 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Ezequiel");
        gerente.setCpf("625.552.923-14");
        gerente.setDatanascimento("10/06/2002");
        gerente.setMatricula("0012320");
        gerente.setSalario(3500);
        gerente.setDepartamento("TI");
        gerente.setBonus(550);
        gerente.imprimir();
    }
}
