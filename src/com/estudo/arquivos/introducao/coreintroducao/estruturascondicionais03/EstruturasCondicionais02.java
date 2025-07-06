package com.estudo.arquivos.introducao.coreintroducao.estruturascondicionais03;
import java.util.Scanner;

public class EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // >= 18 categoria adulto

        Scanner idade = new Scanner(System.in);
        int categoria;
        System.out.println("Digite a idade do usuário: ");
        categoria = idade.nextInt();
        System.out.println("A idade é: "+ categoria);
        idade.close();

        if (categoria < 15) {
            System.out.println("Categoria infantil");
        } else if (categoria >= 15 && categoria < 18) {
            System.out.println("Categoria juvenil");
        }else{
            System.out.println("Categoria adulto");
        }

        //operador ternário
        int alunos = 20;

       String quantidade = alunos == 30 ? "sala cheia" : alunos < 30 && alunos == 15 ? "sala meia cheia" : "sala quase vazia";
        System.out.println(quantidade);
    }
}
