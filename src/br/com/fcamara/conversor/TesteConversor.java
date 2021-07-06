package br.com.fcamara.conversor;

import java.util.Scanner;

public class TesteConversor {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o tipo de conversão: \n" +
                "1 - Temperatura \n" +
                "2 - Moeda \n" +
                "3 - Comprimento");
        int tipoConversao = leitor.nextInt();

        switch (tipoConversao){
            case 1:
                

                ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
                System.out.println("entrei no conversor de temperatura");
                break;
            case 2:
                ConversorMoeda conversorMoeda = new ConversorMoeda();
                System.out.println("entrei no conversor de moeda");
                break;
            case 3:
                ConversorComprimento conversorComprimento = new ConversorComprimento();
                System.out.println("entrei no conversor de comprimento");
            default:
                System.out.println("Informe um valor entre 1 e 3");
                break;
        }



    }
}
