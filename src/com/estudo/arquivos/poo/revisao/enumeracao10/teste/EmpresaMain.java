package com.estudo.arquivos.poo.revisao.enumeracao10.teste;

import com.estudo.arquivos.poo.revisao.enumeracao10.dominio.Empresa;
import com.estudo.arquivos.poo.revisao.enumeracao10.dominio.Funcionario;
import com.estudo.arquivos.poo.revisao.enumeracao10.dominio.Setor;

public class EmpresaMain {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.setNome("Master Consultoria");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Ezequiel");
        funcionario.setIdade(23);
        funcionario.setCpf("253.453.523-32");
        funcionario.setSexo('M');
        funcionario.setEmpresa(empresa);
        funcionario.setSetor(Setor.TECNOLOGIADAINFORMACAO);
        funcionario.setSalario(3500);

        funcionario.imprimir();
    }
}
