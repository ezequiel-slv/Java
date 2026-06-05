package com.revisao.arquivos.introducao01.operadores02;

public class Operadores {
    public static void main(String[] args) {
        exe07();
    }

    public static void exe01(){
        //1) Operadores Aritiméticos

        // +, -, *, /, %

        double a = 15;
        double b = 3;

        double soma = a + b;
        double subtracao = a - b;
        double multiplicacao = a * b;
        double divisao = a / b;
        double resto = a % b;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(resto);

        //Explique a diferença entre / e %.
        //R: (/) Divisão entre dois números, (%) Resto da divisão entre dois números

        System.out.println("------");
        //2) Identificar o tipo

        int x = 7;
        double y = 2;

        //Qual será o tipo do resultado da expressão x + y?
        //R: Double, é o tipo mais preciso em relação a int

        //Qual será o valor final?
        //R: 9.0
        System.out.println("x + y =  " + (x + y));

        System.out.println("------");
        //3) Resto de produto

        double p = 37;
        double c = 5;

        double result = p % c;
//        a) Quantas caixas completas serão usadas?
//          R: 7

//        b) Quantos produtos sobram?
//          R: 2

        System.out.println(result);
    }

    public static void exe02(){
        //Operadores relacionais


//        4) Determine o valor lógico (true ou false):

        boolean caso1 = 8 > 12; //false
        System.out.println(caso1);
        boolean caso2 = 15<=15; //true
        System.out.println(caso2);
        boolean caso3 = 20!=20; //false
        System.out.println(caso3);
        boolean caso4 = 5==5; //true
        System.out.println(caso4);
        boolean caso5 = 9 < 3; // false
        System.out.println(caso5);


//      5)

        System.out.println("-----");

        int numero = 10;

        boolean caso6 = numero >= 20; //false
        boolean caso7 = numero < 20; //true
        boolean caso8 = numero == 20; //false
        boolean caso9 = numero != 20; //true

        System.out.println(caso6);
        System.out.println(caso7);
        System.out.println(caso8);
        System.out.println(caso9);

    }

    public static void exe03(){
        //6) Uma pessoa só pode receber um benefício se:

        int idade = 22;
        double salario = 2800;

        boolean caso = idade >= 18 && salario <= 3000;

        if (caso){
            System.out.println("Recebe o beneficio");
        }else{
            System.out.println("Não recebe");
        }

        //Ela recebe o benefício? Justifique usando lógica booleana.
        //Sim, como tem duas condições verdadeiras o valor voltará true,
        // o && sempre precisará que as duas condições sejam verdadeiras ao mesmo tempo

        System.out.println("---------");

        int idade2 = 16;
        double salario2 = 2500;

        boolean caso2 = idade2 >= 18 && salario2 <= 3000;

        if (caso2){
            System.out.println("Recebe o beneficio");
        }else{
            System.out.println("Não recebe");
        }

        //não recebe, retornando false, já que uma condição não foi cumprida (16 é menor que 18)
    }

    public static void exe04(){
        //8) Uma compra pode ser feita se:

        double contaCorrente = 1500;
        double contaPoupanca = 5000;

        boolean caso = contaCorrente > 2000 || contaPoupanca > 2000;

        if (caso){
            System.out.println("Compra autorizada");
        }else {
            System.out.println("Compra não autorizada");
        }

        //Será autorizada, já que || OU requer que pelo menos uma condição seja verdadeira

        System.out.println("-----");

        double contaCorrente2 = 1000;
        double contaPoupanca2 = 1500;

        boolean caso2 = contaCorrente2 > 2000 || contaPoupanca2 > 2000;

        if (caso2){
            System.out.println("Compra autorizada");
        }else {
            System.out.println("Compra não autorizada");
        }

        //Não será autorizafa, já que nenhuma condição foi cumbrida
    }

    public static void exe05(){
        //10)

        double salario = 1000;

        salario += 500; // 1000 + 500 = 1500
        salario -= 200; // 1500 - 200 = 1300
        salario *= 2; // 1300 * 2 = 2600
        salario /= 4; // 2600 / 4 = 650
        salario %= 3; // 650%3 (resto da divisão entre 650 e 3) = 2
        System.out.println(salario);

        System.out.println("----");

        //11) Transforme as expressões abaixo usando operadores de atribuição:

        int x = 10;
        int y = 10;
        int z = 10;
        int w = 10;

        x += 10;
        y -= 5;
        z *= 3;
        w /= 2;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(w);
    }

    public static void exe06(){
        /*
        12) Dado:

        int idade = 18

        Após executar:
        a) idade++
        b) idade--
        c) idade += 1

        Qual será o valor final?
         */

        int idade = 18;

        idade++;
        idade--;
        idade += 1;
        System.out.println(idade);

        //Valor final: 19

        /*
        13) Explique a diferença entre:

        ++contador

        contador++

        Quando essa diferença é relevante?
         */
        System.out.println("-----");

        int x = 4;
        int a = ++x;
        System.out.println(a);

        int y = 4;
        int b = y++;
        System.out.println(b);
    }

    public static void exe07(){
        /*
        14) Uma pessoa quer financiar um produto se:

        Idade ≥ 21
        E

        (Salário ≥ 3000 OU Tem saldo em poupança ≥ 10000)

        Dados:

        idade = 25

        salario = 2500

        poupanca = 15000

        Ela pode financiar? Resolva passo a passo usando lógica booleana.
        R: Sim, a segunda condição permite o financiamento
         */

        int idade = 21;

        double salario = 2500;

        double poupanca = 15000;

        boolean condicao = idade >= 21 && (salario >= 3000 || poupanca >= 10000);

        if (condicao){
            System.out.println("Financiamento autorizado!");
        }else{
            System.out.println("Financiamento não autorizado!");
        }
    }

}
