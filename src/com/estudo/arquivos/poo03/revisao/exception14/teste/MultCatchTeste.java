package com.estudo.arquivos.poo03.revisao.exception14.teste;

import java.io.IOException;
import java.sql.SQLException;

public class MultCatchTeste {
    public static void main(String[] args) {

        try {
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e ){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }

        try {
            TalvesLanceException();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    public static void TalvesLanceException() throws SQLException, IOException {

    }
}
