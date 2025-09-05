package com.estudo.arquivos.poo03.revisao.heranca08.dominio.subdominio4.teste;

import com.estudo.arquivos.poo03.revisao.heranca08.dominio.subdominio4.dominio.Funcionario;
import com.estudo.arquivos.poo03.revisao.heranca08.dominio.subdominio4.dominio.Setor;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Setor setor = new Setor();
        setor.setNome("Tecnologia da Informação");

        Funcionario funcionario = new Funcionario("Ezequiel", 23, 'M', "625.552.923-14", setor, 5400);
        funcionario.imprimir();
    }
}
