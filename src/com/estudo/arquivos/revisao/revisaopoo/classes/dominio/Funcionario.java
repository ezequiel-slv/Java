package com.estudo.arquivos.revisao.revisaopoo.classes.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public int salario;

    public void mostrarDados(){
        System.out.println("---------");
        System.out.println("nome: " + this.nome);
        System.out.println("idade: " + this.idade);
        System.out.println("salario: " + this.salario);
    }

    public void mostrarResultado(Funcionario pessoa1, Funcionario pessoa2, Funcionario pessoa3){

        System.out.println("---------");
        System.out.println("Média salárial dos três funcionários: ");

        int media = ((pessoa1.salario + pessoa2.salario + pessoa3.salario) / 3);

        if ((media) == 0){
            System.out.println("Não existe");
            return;
        }
        System.out.println(media);
    }
}
