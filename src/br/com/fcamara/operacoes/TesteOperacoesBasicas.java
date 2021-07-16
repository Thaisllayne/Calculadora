package br.com.fcamara.operacoes;

import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteOperacoesBasicas {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Escolha uma opção \n" +
                "1 - soma \n" +
                "2 - subtração \n" +
                "3 - multiplicação \n" +
                "4 - divisão");

        String operador = leitor.nextLine();
        OperacoesBasicas.soNumeros(operador);

        try{
            System.out.println("Informe o primeiro valor:");
            Double num1 = leitor.nextDouble();

            System.out.println("Informe o segundo valor:");
            Double num2 = leitor.nextDouble();


            OperacoesBasicas calculo1 = new OperacoesBasicas(operador, num1, num2);
            System.out.println(calculo1);

        } catch (InputMismatchException exception){
            System.out.println("Para fazer os cálculos, somente com números.");
        }

        leitor.close();
    }
}