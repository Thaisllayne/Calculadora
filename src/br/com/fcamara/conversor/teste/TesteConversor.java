package br.com.fcamara.conversor.teste;

import br.com.fcamara.conversor.modelo.ConversorComprimento;
import br.com.fcamara.conversor.modelo.ConversorMoeda;
import br.com.fcamara.conversor.modelo.ConversorTemperatura;

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
                System.out.println("Informe qual a unidade de medida atual: \n" +
                        "1 - Celsius \n" +
                        "2 - Fahrenheit \n" +
                        "3 - Kelvin");
                int escalaTermometricaAtual = leitor.nextInt();

                System.out.println("Informe o valor da temperatura que deseja converter:");
                int temperaturaAtual = leitor.nextInt();

                System.out.println("Informe para qual unidade de medida será convertida: \n" +
                        "1 - Celsius \n" +
                        "2 - Fahrenheit \n" +
                        "3 - Kelvin");
                int escalaTermometricaConvertida = leitor.nextInt();

                //System.out.println(temperaturaAtual);

                ConversorTemperatura conversorTemperatura = new ConversorTemperatura(temperaturaAtual,
                        escalaTermometricaAtual, escalaTermometricaConvertida);
                System.out.println(conversorTemperatura);
                break;

            case 2:
                ConversorMoeda conversorMoeda = new ConversorMoeda();
                System.out.println("entrei no conversor de moeda");
                break;

            case 3:
                ConversorComprimento conversorComprimento = new ConversorComprimento();
                System.out.println("entrei no conversor de comprimento");

            default:
                System.out.println("Por favor, informe um valor entre 1 e 3");
                break;
        }



    }
}
