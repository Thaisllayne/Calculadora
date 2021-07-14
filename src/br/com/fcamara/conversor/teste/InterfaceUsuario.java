package br.com.fcamara.conversor.teste;

import br.com.fcamara.conversor.modelo.ConversorComprimento;
import br.com.fcamara.conversor.modelo.ConversorMoeda;
import br.com.fcamara.conversor.modelo.ConversorTemperatura;

import java.util.Scanner;

public class InterfaceUsuario {
    private Scanner leitor;

    public InterfaceUsuario() {
        this.leitor = new Scanner(System.in);
    }

    public double forTemperatura(){
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

        ConversorTemperatura conversorTemperatura = new ConversorTemperatura(temperaturaAtual,
                escalaTermometricaAtual, escalaTermometricaConvertida);
        System.out.println(conversorTemperatura);

        return escalaTermometricaConvertida;
    }

    public double forMoeda(){
        System.out.println("Informe a moeda atual: \n" +
                "1 - Dólar americano \n" +
                "2 - Euro \n" +
                "3 - Real");
        int moedaAtual = leitor.nextInt();

        System.out.println("Informe o valor atual:");
        double valorMoedaAtual = leitor.nextDouble();

        System.out.println("Informe para qual moeda será convertida: \n" +
                "1 - Dólar americano \n" +
                "2 - Euro \n" +
                "3 - Real");
        int moedaConvertida = leitor.nextInt();

        ConversorMoeda conversorMoeda = new ConversorMoeda(valorMoedaAtual, moedaAtual, moedaConvertida);
        System.out.println(conversorMoeda);

        return valorMoedaAtual;
    }

    public double forComprimento(){

        System.out.println("Informe a unidade de medida atual \n" +
                "1 - Quilômetro \n" +
                "2 - Metro \n" +
                "3 - Centímetro");
        int unidadeDeMedidaAtual = leitor.nextInt();

        System.out.println("Informe o valor: ");
        double valorMedidaAtual = leitor.nextDouble();

        System.out.println("Informe para qual unidade de medida será convertida: \n" +
                "1 - Quilômetro \n" +
                "2 - Metro \n" +
                "3 - Centímetro");
        int unidadeDeMedidaConvertida = leitor.nextInt();

        ConversorComprimento conversorComprimento = new ConversorComprimento(valorMedidaAtual,
                unidadeDeMedidaAtual, unidadeDeMedidaConvertida);
        System.out.println(conversorComprimento);

        return valorMedidaAtual;
    }

}
