package br.com.fcamara.conversor.modelo;

public class ConversorComprimento {
    private double valorMedidaAtual;
    private int unidadeDeMedidaAtual;
    private int unidadeDeMedidaConvertida;

    public ConversorComprimento(double valorMedidaAtual, int unidadeDeMedidaAtual, int unidadeDeMedidaConvertida) {
        this.valorMedidaAtual = valorMedidaAtual;
        this.unidadeDeMedidaAtual = unidadeDeMedidaAtual;
        this.unidadeDeMedidaConvertida = unidadeDeMedidaConvertida;

        if (unidadeDeMedidaAtual == unidadeDeMedidaConvertida){
            System.out.println("Já está convertida");
        } else{
            ConversorC();
        }
    }

    public void ConversorC(){
        double quilometro = 0;
        double metro = 0;
        double centimetro = 0;
        switch (this.unidadeDeMedidaAtual){
            case 1:
                quilometro = this.valorMedidaAtual;
                if (this.unidadeDeMedidaConvertida == 2){
                    metro = quilometro * 1000;
                    System.out.println("Metro: " + metro);
                } else if (this.unidadeDeMedidaConvertida == 3){
                    centimetro = quilometro * 100000;
                    System.out.println("Centímetro: " + centimetro);
                } else{
                    System.out.println("Digite uma opção válida!");
                }
                break;

            case 2:
                metro = this.valorMedidaAtual;
                if (this.unidadeDeMedidaConvertida == 1){
                    quilometro = metro/1000;
                    System.out.println("Quilômetro: " + quilometro);
                } else if (this.unidadeDeMedidaConvertida == 3){
                    centimetro = metro * 100;
                    System.out.println("Centímetro: " + centimetro);
                } else{
                    System.out.println("Digite uma opção válida!");
                }
                break;
            case 3:
                centimetro = this.valorMedidaAtual;
                if (this.unidadeDeMedidaConvertida == 1){
                    quilometro = centimetro/(100000);
                    // a saída é diferente
                    System.out.println("Quilômetro: " + quilometro);
                } else if (this.unidadeDeMedidaConvertida == 2){
                    metro =  centimetro/100;
                    System.out.println("Metro: " + metro);
                } else{
                    System.out.println("Digite uma opção válida!");
                }
                break;
            default:
                System.out.println("Digite um valor entre 1 e 3");
                break;
        }





    }



}
