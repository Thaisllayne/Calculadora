package br.com.fcamara.operacoes;

public class OperacoesBasicas {

    private double num1;
    private double num2;
    private String operador;

    public OperacoesBasicas(String operador, double num1, double num2) {
        this.operador = operador;

        switch (operador) {
            case "1":
                OperacoesBasicas.somar(num1, num2);
                System.out.println("O resultado da soma é: " + somar(num1, num2));
                break;
            case "2":
                OperacoesBasicas.subtrair(num1, num2);
                System.out.println("O resultado da subtração é: " + subtrair(num1, num2));
                break;
            case "3":
                OperacoesBasicas.multiplicar(num1, num2);
                System.out.println("O resultado da multiplicação é: " + multiplicar(num1, num2));
                break;
            case "4":
                OperacoesBasicas.dividir(num1, num2);
                System.out.println("O resultado da divisão é: " + dividir(num1, num2));
                break;
        }
    }

    public static void soNumeros(String operador){
        if (!operador.matches("[1-4]")){
            System.out.println("Por favor, informe uma opção válida");
            System.exit(1);
        }
    }

    public static double somar(double num1, double num2){
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2){
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2){
        return num1 * num2;
    }

    public static double dividir(double num1, double num2){
        if (num2==0){
            throw new ArithmeticException("Impossível fazer uma divisão por 0");
        } else{
            return num1/num2;
        }
    }

    @Override
    public String toString() {
        return "OperacoesBasicas: \n" +
                "Número 1: " + num1 +
                ", Número 2: " + num2;
    }
}