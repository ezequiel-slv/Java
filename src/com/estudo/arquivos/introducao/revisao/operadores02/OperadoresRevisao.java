package com.estudo.arquivos.introducao.revisao.operadores02;

import java.util.Scanner;

public class OperadoresRevisao {
    public static void main(String[] args) {
        Exe01();
        System.out.println("-----");
        Exe02();
        System.out.println("-----");
        Exe03();
        System.out.println("-----");
        Exe04();
        System.out.println("-----");
        Exe05();
        System.out.println("-----");
        Exe06();
        System.out.println("-----");
        Exe07();
        System.out.println("-----");
        Exe08();
        System.out.println("-----");
        Exe09();
        System.out.println("-----");
        Exe10();
        System.out.println("-----");
        Exe11();
        System.out.println("-----");
        Exe12();
    }

    public static void Exe01(){
        int num1 = 30;
        int num2 = 20;

        int media = (num1 + num2) / 2;

        System.out.println("Média: " + media);
    }

    public static void Exe02(){
        double produtoA = 45.30;
        double produtoB = 78.99;
        double produtoC = 12.50;

        double soma = produtoA + produtoB + produtoC;

        double desconto = soma * 0.9;

        System.out.println("Valor total com desconto: " + desconto);
    }
    public static void Exe03(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int num = entrada.nextInt();

        String saida = num % 2 == 0? "é par" : "é impar";
        System.out.println(num + " " + saida);
    }
    public static void Exe04(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        System.out.println("Digite um número para dividir: ");
        int divisor = entrada.nextInt();

        String saida = (num % divisor == 5 && num % divisor == 3)? "é divisível por 3 e 5" : "não é divisível por 3 e 5";
        System.out.println(saida);
    }
    public static void Exe05(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a idade do joão 1: ");
        int joao = entrada.nextInt();

        System.out.println("Digite a idade da Maria: ");
        int maria = entrada.nextInt();

        String saida = joao > maria ? "João é mais velho que Maria"
                : maria > joao ? "Maria é mais velha que João"
                : "Ambos tem a mesma idade";
        System.out.println(saida);
    }

    public static void Exe06(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma nota de 1 a 10: ");
        int nota = entrada.nextInt();

        String saida = nota >= 7 && nota <=10 ? "Aprovado"
                : nota < 7 ? "Reprovado"
                : "Número inválido";
        System.out.println(saida);
    }

    public static void Exe07(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma idade: ");
        int idade = entrada.nextInt();

        System.out.println("Digite um peso: ");
        double peso = entrada.nextDouble();

        String saida = (idade >= 18 && idade <= 69) && (peso > 50) ? "Pode doar" : "Não pode doar";
        System.out.println(saida);
    }

    public static void Exe08(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Você já concluiu o curso básico? clique 's' para sim ou 'n' para não: ");
        String curso = entrada.nextLine();

        System.out.println("Quantos tempo de experiência você tem (digite em meses): ");
        int experiencia = entrada.nextInt();

        String saida = curso.equals("s") && experiencia > 12 ? "Curso avançado desbloqueado" : "Curso ainda não disponivel";
        System.out.println(saida);
    }

    public static void Exe09(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite a nota 2: ");
        double nota2 = entrada.nextDouble();

        System.out.println("Digite a nota 3: ");
        double nota3 = entrada.nextDouble();

        int atividade = 16;

        double aprovacaoAtvd = atividade * 0.8;

        System.out.println("Quantas atividades você fez das 16: ");
        double atvdFeita = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        String saida = media > 4 || atvdFeita == aprovacaoAtvd ? "Aprovado" : "Reprovado";
        System.out.println(saida);
    }

    public static void Exe10(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o dinheiro gasto: ");
        double dinheiroGasto = entrada.nextDouble();

        System.out.println("É cliente vip? se sim digite 's' se não digite 'n': ");
        String clienteVip = entrada.nextLine();

        if (dinheiroGasto > 200 || clienteVip.equals("s")){
            System.out.println("Parabens! Você ganhou um brinde");
        }
    }

    public static void Exe11(){
        int num = 10;
        System.out.println(num);
        num += 5;
        System.out.println(num);
        num -= 2;
        System.out.println(num);
        num *= 3;
        System.out.println(num);
    }

    public static void Exe12(){
        int ferias = 30;

        ferias += 2;
        ferias += 2;
        ferias += 2;
        ferias += 2;

        ferias -= 5;
        System.out.println(ferias);
    }

    public static void Exe013(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Digite outro número: ");
        double num2 = entrada.nextDouble();

        if (num1 == 0){
            System.out.println("Não é possivel divisão por zero");
        } else if (num2 % num1 == 0) {
            System.out.println(num2 + " é multiplo de "+ num1);
        }else{
            System.out.println(num2 + " não é multiplo de " + num1);
        }
    }

    public static void Exe14(){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o tempo de experiência em meses: ");
        double experiencia = entrada.nextDouble();

        double salario = 3.200;
        double reajuste1 = salario * 0.15;
        double reajuste2 = salario * 0.05;
        boolean condicao = experiencia > 36;

        if (condicao){
            System.out.println("Salário com reajuste: " + reajuste1);
        }else{
            System.out.println("Salário com reajuste: " + reajuste2);
        }
    }

}
