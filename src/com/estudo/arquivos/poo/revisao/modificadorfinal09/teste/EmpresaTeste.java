package com.estudo.arquivos.poo.revisao.modificadorfinal09.teste;

import com.estudo.arquivos.poo.revisao.modificadorfinal09.dominio.Empresa;

public class EmpresaTeste {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.FUNCIONARIO.setNome("Ezy");
        empresa.FUNCIONARIO.imprime();
        //System.out.println(empresa.FUNCIONARIO); chama pelo toString
    }
}
