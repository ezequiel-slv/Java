package com.estudo.arquivos.poo03.revisao.enumeracao10.dominio;

public class Cliente extends Pessoa{
private TipoCliente tipoCliente;
private final Empresa empresa;
private final Funcionario funcionario;

    public Cliente(String nome, int idade, String cpf, char sexo, TipoCliente tipoCliente, Empresa empresa, Funcionario funcionario) {
        super(nome, idade, cpf, sexo);
        this.tipoCliente = tipoCliente;
        this.empresa = empresa;
        this.funcionario = funcionario;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo cliente: " + tipoCliente.getTipoClienteFormat() + " | " + tipoCliente.getVALOR());
        System.out.println("Comprou na empresa: " + empresa.toString());
        System.out.println("Atendido por: " + funcionario.getNome());
    }
}
