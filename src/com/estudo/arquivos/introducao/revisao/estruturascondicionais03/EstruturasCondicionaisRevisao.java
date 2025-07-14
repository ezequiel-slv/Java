package com.estudo.arquivos.introducao.revisao.estruturascondicionais03;

import java.util.Scanner;

public class EstruturasCondicionaisRevisao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        /*
        exe01(entrada);
        exe02(entrada);
        exe03(entrada);
        exe04(entrada);
        exe05(entrada);
        exe06(entrada);
        exe07(entrada);
        exe08(entrada);
        exe09(entrada);
        exe10(entrada);
        exe11(entrada);
        exe12(entrada);
        exe13(entrada);
        */
        exe14(entrada);
        entrada.close();
    }

    public static void exe01(Scanner entrada){

        System.out.println("Digite uma idade: ");
        int idade = entrada.nextInt();

        boolean condicao = idade < 18;

        if (condicao){
            System.out.println("Não é permitido dirigir");
        }
        if (!condicao){
            System.out.println("Permitido dirigir");
        }
    }

    public static void exe02(Scanner entrada){

        System.out.println("Digite um número: ");
        double num = entrada.nextDouble();

        boolean condicao = num < 0;

        if (condicao){
            System.out.println("O número é negativo");
        }
        if (!condicao){
            System.out.println("O número não é negativo");
        }
    }

    public static void exe03(Scanner entrada){

        System.out.println("Digite um número: ");
        double num = entrada.nextDouble();

        if (num > 0){
            System.out.println("Positivo");
        } else if (num < 0) {
            System.out.println("Negativo");
        }else{
            System.out.println("Igual a zero");
        }
    }

    public static void exe04(Scanner entrada){

        System.out.println("Digite a primeira nota: ");
        double n1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double n2 = entrada.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double n3 = entrada.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        if (media < 5){
            System.out.println("Reprovado");
        } else if (media >= 5 && media <=7){
            System.out.println("Recuperação");
        }else{
            System.out.println("Aprovado");
        }
    }

    public static void exe05(Scanner entrada){

        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        String saida = num % 2 == 0 ? "é par" : "é ímpar";
        System.out.println(saida);
    }

    public static void exe06(Scanner entrada){

        System.out.println("Digite valor pago: ");
        int valor = entrada.nextInt();

        String saida = valor < 100 ? "Barato" : "Caro";
        System.out.println(saida);
    }

    public static void exe07(Scanner entrada){

        System.out.println("Digite a estação em que está (1-primavera, 2-verão, 3-outono, 4-inverno): ");
        int estacao = entrada.nextInt();

        switch (estacao){
            case 1 : System.out.println("Primavera");
                break;
            case 2 : System.out.println("Verão");
                break;
            case 3 : System.out.println("Outono");
                break;
            case 4 : System.out.println("Inverno");
                break;
            default: System.out.println("Número inválido");
                break;
        }
    }

    public static void exe08(Scanner entrada){

        System.out.println("Digite o valor de 1 a 12 para representar o mês: ");
        int mes = entrada.nextInt();

        switch (mes){
            case 1 : System.out.println("Janeiro");
                break;
            case 2 : System.out.println("Fevereiro");
                break;
            case 3 : System.out.println("Março");
                break;
            case 4 : System.out.println("Abril");
                break;
            case 5 : System.out.println("Maio");
                break;
            case 6 : System.out.println("Junho");
                break;
            case 7 : System.out.println("Julho");
                break;
            case 8 : System.out.println("Agosto");
                break;
            case 9 : System.out.println("Setembro");
                break;
            case 10 : System.out.println("Outubro");
                break;
            case 11: System.out.println("Novembro");
                break;
            case 12 : System.out.println("Dezembro");
                break;
            default: System.out.println("Número inválido");
                break;
        }
    }

    public static void exe09(Scanner entrada){
        System.out.println("Digite a tempetaruta: ");
        int temp = entrada.nextInt();

        String saida = temp >= 30 ? "Clima quente" : "Clima ameno";
        System.out.println(saida);
    }

    public static void exe10(Scanner entrada){
        System.out.println("Digite um número: ");
        double num1 = entrada.nextDouble();

        System.out.println("Digite outro número: ");
        double num2 = entrada.nextDouble();



        System.out.println("Escolha um número para representar um operador (1 = (+), 2 = (-), 3 = (/), 4 = (*): ");
        int calculo = entrada.nextInt();

        switch (calculo){
            case 1 :
                System.out.println(num1 + num2);
                break;
            case 2 :
                System.out.println(num1 - num2);
                break;
            case 3 :
                System.out.println(num1 / num2);
                break;
            case 4 :
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("Número inválido");
        }

    }

    public static void exe11(Scanner entrada){

        System.out.println("Digite o valor do lado 1: ");
        int lado1 = entrada.nextInt();

        System.out.println("Digite o valoe do lado 2: ");
        int lado2 = entrada.nextInt();

        System.out.println("Digite o valor do lado 3: ");
        int lado3 = entrada.nextInt();

        int media = (lado1 + lado2 + lado2)/3;

        boolean equilatero = lado1 == media && lado2 == media && lado3 == media;

        boolean isosceles = lado1 == lado2 || lado1 == lado3 || lado2 == lado3;


        if (equilatero){
            System.out.println("Triângulo equilatero");
        } else if (isosceles) {
            System.out.println("Triângulo isósceles");
        } else {
            System.out.println("Triângulo escaleno");
        }
    }

    public static void exe12(Scanner entrada){

        System.out.println("Digite a altura: ");
        double altura = entrada.nextDouble();

        System.out.println("Digite o peso: ");
        double peso = entrada.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        }
        if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso normal");
        }
        if (imc >= 25 && imc <= 29.9){
            System.out.println("Sobrepeso");
        }
        if (imc >= 30){
            System.out.println("Obesidade");
        }
    }

    public static void exe13(Scanner entrada){
        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        if (num == 0){
            System.out.println("é igual a zero");
        }else if (num % 2 == 0){
            System.out.println("é par");
        }else {
            System.out.println("é impar");
        }
    }

    public static void exe14(Scanner entrada){
        System.out.println("Digite o valor da compra: ");
        double valor = entrada.nextDouble();

        System.out.println("Escolha uma categoria (1 para comum, 2 para associado, 3 para VIP): ");
        int categoria = entrada.nextInt();


        boolean comum = categoria == 1;
        double comumCalculo = valor * 1;

        boolean associado = categoria == 2;
        double associadoCalculo = valor * 0.9;

        boolean vip = valor == 3;
        double vipCalculo = categoria * 0.8;

        if (comum){
            System.out.println(comumCalculo);
        } else if (associado) {
            System.out.println(associadoCalculo);
        } else if (vip) {
            System.out.println(vipCalculo);
        } else {
            System.out.println("Número inválido");
        }
    }

    
}
