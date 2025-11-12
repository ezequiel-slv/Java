package com.estudo.arquivos.poo03.revisao.polimorfismo13.teste;

import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio4.Estagiario;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio4.Funcionario;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio4.Gerente;
import com.estudo.arquivos.poo03.revisao.polimorfismo13.dominio4.Vendedor;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario vendedor = new Vendedor("Ezequiel", 3.500);
        Funcionario gerente = new Gerente("Ezequiel", 7.000);
        Funcionario estagiario = new Estagiario("Ezequiel", 1.200);

        vendedor.calcularBonus();
        vendedor.imprimir();

        gerente.calcularBonus();
        gerente.imprimir();

        estagiario.calcularBonus();
        estagiario.imprimir();
    }
}
