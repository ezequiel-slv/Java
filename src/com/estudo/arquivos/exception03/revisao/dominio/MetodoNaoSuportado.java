package com.estudo.arquivos.exception03.revisao.dominio;

public class MetodoNaoSuportado implements Operacao {

    @Override
    public void alterar() {
        System.out.println("Alterando informações do banco de dados");
    }

    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Erro: não é permitido excluir banco de dados");
    }
}
