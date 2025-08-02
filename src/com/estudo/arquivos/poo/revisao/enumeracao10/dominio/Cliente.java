package com.estudo.arquivos.poo.revisao.enumeracao10.dominio;

public class Cliente extends Pessoa{
private TipoCliente tipoCliente;
private TipoPagamento tipoPagamento;
private Empresa empresa;
private Funcionario funcionario;

    public Cliente(String nome, int idade, String cpf, char sexo, TipoCliente tipoCliente,
                   TipoPagamento tipoPagamento, Empresa empresa, Funcionario funcionario) {
        super(nome, idade, cpf, sexo);
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
        this.empresa = empresa;
        this.funcionario = funcionario;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Tipo cliente: " + tipoCliente.getTipoClienteFormat() + " | " + tipoCliente.getVALOR());
        System.out.println("Tipo pagamento: " + tipoPagamento);
        System.out.println("Comprou na empresa: " + empresa.toString());
        System.out.println("Atendido por: " + funcionario.getNome());
    }
}
