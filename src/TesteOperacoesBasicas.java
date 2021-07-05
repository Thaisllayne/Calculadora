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

        if (operador == 0){
            System.out.println("Saindo da Calculadora..");
        } else if(operador > 4){
            System.out.println("Informe uma operação existente");
        } else{
            System.out.println("Informe o primeiro valor:");
            double num1 = leitor.nextDouble();

            System.out.println("Informe o segundo valor:");
            double num2 = leitor.nextDouble();

            OperacoesBasicas calculo1 = new OperacoesBasicas(num1, num2, operador);

            //System.out.println(calculo1);
        }

        leitor.close();
    }
}