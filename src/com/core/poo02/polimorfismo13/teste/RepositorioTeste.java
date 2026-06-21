package com.core.poo02.polimorfismo13.teste;

import com.core.poo02.polimorfismo13.repositorio.Repositorio;
import com.core.poo02.polimorfismo13.repositorio.RepositorioBancoDeDados;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
