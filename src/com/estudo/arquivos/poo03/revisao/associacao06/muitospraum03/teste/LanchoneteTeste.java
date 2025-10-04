package com.estudo.arquivos.poo03.revisao.associacao06.muitospraum03.teste;

import com.estudo.arquivos.poo03.revisao.associacao06.muitospraum03.dominio.Funcionario;
import com.estudo.arquivos.poo03.revisao.associacao06.muitospraum03.dominio.Lanchonete;

public class LanchoneteTeste {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Joana");
        Funcionario f2 = new Funcionario("Maria");
        Funcionario [] funcionarios = {f1, f2};

        Lanchonete lanchonete = new Lanchonete("Bolo Feito", funcionarios);
        lanchonete.imprimir();
    }
}
