public class CalculadoraOperacoesBasicas {

    private double num1;
    private double num2;
    private int operador;

    public CalculadoraOperacoesBasicas(double num1, double num2, int operador) {
        this.num1 = num1;
        this.num2 = num2;
        this.operador = operador;

        switch (operador) {
            case 1:
                CalculadoraOperacoesBasicas.somar(num1, num2);
                break;
            case 2:
                CalculadoraOperacoesBasicas.subtrair(num1, num2);
                break;
            case 3:
                CalculadoraOperacoesBasicas.multiplicar(num1, num2);
                break;
            case 4:
                CalculadoraOperacoesBasicas.dividir(num1, num2);
                break;
            case 0:
                System.out.println("Saindo da Calculadora..");
                break;
        }
    }

    public static void somar(double num1, double num2){
        double total = num1 + num2;
        System.out.println("O valor da soma é: " + total);
    }

    public static void subtrair(double num1, double num2){
        double total = num1 - num2;
        System.out.println("O valor da subtração é: " + total);
    }

    public static void multiplicar(double num1, double num2){
        double total = num1 * num2;
        System.out.println("O valor da multiplicação é: " + total);
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
        return "CalculadoraOperacoesBasicas{" +
                "Número 1=" + num1 +
                ", Número 2=" + num2 +
                ", operador='" + operador + '\'' +
                '}';
    }
}
