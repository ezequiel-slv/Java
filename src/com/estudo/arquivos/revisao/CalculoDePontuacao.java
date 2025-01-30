package com.estudo.arquivos.revisao;
import java.util.Scanner;
/**
 Iniciante: Pontuação total é menor que 50 ou idade menor que 18.
 Intermediário: Pontuação total entre 50 e 100 e idade entre 18 e 30.
 Avançado: Pontuação total acima de 100 ou idade maior que 30.
 * formula: pontuacaoTotal=pontosObtidos+bonus−(tempoDeJogo%3).
 * */
public class CalculoDePontuacao {
    public static void main(String[] args) {
        Scanner pontos = new Scanner (System.in);
        int pontosObtidos;
        System.out.println("Quantos pontos o jogador fez na rodada: ");
        pontosObtidos = pontos.nextInt();
        System.out.println("O jogador teve "+ pontosObtidos +" pontos na rodada");

        Scanner bonus = new Scanner (System.in);
        float bonusObtidos;
        System.out.println("Bonus que o jogador recebeu: ");
        bonusObtidos = bonus.nextFloat();
        System.out.println("jogador recebeu " + bonusObtidos + " de bonus");

        Scanner idade = new Scanner (System.in);
        int idadeDoJogador;
        System.out.println("Idade do jogador: ");
        idadeDoJogador = idade.nextInt();
        System.out.println("A idade do jogador é " + idadeDoJogador + " anos");

        Scanner tempo = new Scanner (System.in);
        int tempoDeJogo;
        System.out.println("Tempo de jogo do jogador em horas: ");
        tempoDeJogo = tempo.nextInt();
        System.out.println("O jogador jogou por " + tempoDeJogo + " horas");

        double pontuacaoTotal = pontosObtidos + bonusObtidos - (tempoDeJogo % 3);

        String categoria;
        if (pontuacaoTotal < 50 || idadeDoJogador < 18){
            categoria = "Iniciante";
        }else if(pontuacaoTotal >= 50 && pontuacaoTotal <= 100 && idadeDoJogador > 18 && idadeDoJogador < 30){
            categoria = "Intermediário";
        }else{
            categoria = "Avançado";
        }

        System.out.println("A categoria do jogador é " + categoria);
    }

}
