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

        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        switch (tipoConversao){
            case 1:
                interfaceUsuario.forTemperatura();
                break;
            case 2:
                interfaceUsuario.forMoeda();
                break;
            case 3:
                interfaceUsuario.forComprimento();
                break;
            default:
                System.out.println("Por favor, informe um valor entre 1 e 3");
                break;
        }
    }
}
