package com.estudo.arquivos.poo03.revisao.classesabstratas11.teste;

import com.estudo.arquivos.poo03.revisao.classesabstratas11.dominio.Atendente;
import com.estudo.arquivos.poo03.revisao.classesabstratas11.dominio.Desenvolvedor;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Ezequiel", 3000);
        System.out.println(desenvolvedor);

        System.out.println("-----");

        Atendente atendente = new Atendente("Julia", 3000);
        System.out.println(atendente);
    }
}
