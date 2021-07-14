package br.com.fcamara.conversor.modelo;

public class ConversorMoeda {

    private double valorMoedaAtual;
    private int moedaAtual;
    private int moedaConvertida;

    public ConversorMoeda(double valorMoedaAtual, int moedaAtual, int moedaConvertida) {
        this.valorMoedaAtual = valorMoedaAtual;
        this.moedaAtual = moedaAtual;
        this.moedaConvertida = moedaConvertida;

        if (moedaAtual == moedaConvertida){
            System.out.println("Já está convertida");
        } else{
            ConversorM();
        }
    }

    public void ConversorM(){
        double dolar = 0;
        double euro = 0;
        double real = 0;
        switch (this.moedaAtual){
            case 1:
                dolar = this.valorMoedaAtual;
                if (this.moedaConvertida == 2){
                    euro = dolar * 0.846;
                    System.out.println("Euro: " + euro);
                }else if (this.moedaConvertida == 3){
                    real = dolar * 5.20;
                    System.out.println("Real: " + real);
                } else{
                    System.out.println("Digite uma opção válida!");
                }
                break;

            case 2:
                euro = this.valorMoedaAtual;
                if (this.moedaConvertida == 1){
                    dolar = euro * 1.18;
                    System.out.println("Dólar: " + dolar);
                } else if (this.moedaConvertida == 3){
                    real = euro * 6.14;
                    System.out.println("Real: " + real);
                } else{
                    System.out.println("Digite uma opção válida!");
                }
                break;

            case 3:
                real = this.valorMoedaAtual;
                if (this.moedaConvertida == 1){
                    dolar = real * 0.19;
                    System.out.println("Dólar: " + dolar);
                } else if (this.moedaConvertida == 2){
                    euro = real * 0.16;
                    System.out.println("Euro: " + euro);
                } else{
                    System.out.println("Digite uma opção válida!");
                }
                break;

            default:
                System.out.println("Digite uma opção válida");
                break;
        }
    }

    @Override
    public String toString() {
        return "Conversor de moedas: \n" +
                "O valor é de " + valorMoedaAtual +
                ", moedaAtual: " + moedaAtual +
                ", moedaConvertida: " + moedaConvertida;
    }
}
