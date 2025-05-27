package com.estudo.arquivos.poo.exception.multicatch;

import javax.annotation.processing.FilerException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Multicatch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        calculadora(entrada);
        foraDeCalculadora();
    }
        public static void calculadora(Scanner entrada){
            System.out.println("Digite o primeiro número: ");
            int num1 = entrada.nextInt();

            System.out.println("Digite o segundo número");
            int num2 = entrada.nextInt();

            try (entrada) {
                int resultado = num1 / num2;
                System.out.println(resultado);
            } catch (ArithmeticException e) {
                System.out.println("Erro: ArithmeticException");
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Erro: ArrayIndexOutOfBoundsException");
            } catch(ClassCastException e){
                System.out.println("Erro: ClassCastException ");
            } catch (RuntimeException e){
                System.out.println("Erro: RuntimeException");
            }
            finally {
                System.out.println("Programa finalizado");
            }

        }

        public static void foraDeCalculadora(){
            File file = new File("arquivo" + File.separator + ".txt");

            try{
                if (!file.exists()){
                    boolean newFile = file.createNewFile();
                    System.out.println("Arquivo criado: " + newFile);
                }
            }catch (FilerException e){
                System.out.println("Erro: FilerException");
            }catch (IOException e){
                System.out.println("Erro: IOException");
            }
        }

}
