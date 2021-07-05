import java.util.Scanner;

public class TesteOperacoesBasicas {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Escolha uma opção \n" +
                "1 - soma \n" +
                "2 - subtração \n" +
                "3 - multiplicação \n" +
                "4 - divisão \n" +
                "0 - sair");
        int operador = leitor.nextInt();

        System.out.println("Informe o primeiro valor:");
        double num1 = leitor.nextDouble();

        System.out.println("Informe o segundo valor:");
        double num2 = leitor.nextDouble();

        CalculadoraOperacoesBasicas calculo1 = new CalculadoraOperacoesBasicas(num1, num2, operador);

        System.out.println(calculo1);

        leitor.close();











    }

}
