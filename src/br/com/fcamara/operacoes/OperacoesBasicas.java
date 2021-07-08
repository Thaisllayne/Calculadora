package br.com.fcamara.operacoes;

public class OperacoesBasicas {

    private double num1;
    private double num2;
    private int operador;

    public OperacoesBasicas(double num1, double num2, int operador) {
        this.num1 = num1;
        this.num2 = num2;
        this.operador = operador;

        switch (operador) {
            case 1:
                OperacoesBasicas.somar(num1, num2);
                break;
            case 2:
                OperacoesBasicas.subtrair(num1, num2);
                break;
            case 3:
                OperacoesBasicas.multiplicar(num1, num2);
                break;
            case 4:
                OperacoesBasicas.dividir(num1, num2);
                break;
        }
    }

    public static void somar(double num1, double num2){
        double total = num1 + num2;
        System.out.println("O resultado da soma é: " + total);
    }

    public static void subtrair(double num1, double num2){
        double total = num1 - num2;
        System.out.println("O resultado da subtração é: " + total);
    }

    public static void multiplicar(double num1, double num2){
        double total = num1 * num2;
        System.out.println("O resultado da multiplicação é: " + total);
    }

    public static void dividir(double num1, double num2){
        if (num2==0){
            throw new ArithmeticException("Impossível fazer uma divisão por 0");
        } else{
            double total = num1/num2;
            System.out.println("O resultado da divisão é: " + total);
        }
    }

    @Override
    public String toString() {
        return "OperacoesBasicas{" +
                "Número 1=" + num1 +
                ", Número 2=" + num2 +
                ", operador='" + operador + '\'' +
                '}';
    }
}