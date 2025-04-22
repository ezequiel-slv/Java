package com.estudo.arquivos.revisao.revisaopoo.construtores.dominio;

public class ImprimeCarro {
    private final Carro carro;
    private final Carro02 carro02;
    private final int escolha;

    public ImprimeCarro(Carro carro, Carro02 carro02, int escolha){
        this.carro = carro;
        this.carro02 = carro02;
        this.escolha = escolha;
    }

    public void imprimirEscolha(){
        if (escolha == 1){
            System.out.println(this.carro);
            carro.imprime();
        } else if (escolha == 2) {
            System.out.println(this.carro02);
            carro02.imprime();
        }else{
            System.out.println("Nenhum carro escolhido");
        }
    }
}
