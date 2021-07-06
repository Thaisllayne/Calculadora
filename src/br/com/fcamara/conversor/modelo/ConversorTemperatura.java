package br.com.fcamara.conversor.modelo;

public class ConversorTemperatura {

    private double temperaturaAtual;
    private int escalaTermometricaAtual;
    private int escalaTermometricaConvertida;

    public ConversorTemperatura(double temperaturaAtual, int escalaTermometricaAtual, int escalaTermometricaConvertida) {
        this.temperaturaAtual = temperaturaAtual;
        this.escalaTermometricaAtual = escalaTermometricaAtual;
        this.escalaTermometricaConvertida = escalaTermometricaConvertida;

        // fazer validações???

        if(escalaTermometricaAtual == escalaTermometricaConvertida){
            System.out.println("As unidades termométricas são iguais!");
        } else{
            ConversorT();
        }

    }

    private void ConversorT() {
        double celsius = 0;
        double fahrenheit = 0;
        double kelvin = 0;
        switch (this.escalaTermometricaAtual){
            case 1:
                celsius = this.temperaturaAtual;
                if (this.escalaTermometricaConvertida == 2){
                    fahrenheit = (celsius * 1.8) + 32;
                    System.out.println("Fahrenheit: " + fahrenheit);
                }
                else if (this.escalaTermometricaConvertida == 3){
                    kelvin = celsius + 273.15;
                    System.out.println("Kelvin: " + kelvin);
                }
                else{
                    System.out.println("Digite uma opção válida!");
                }
                break;

            case 2:
                fahrenheit = this.temperaturaAtual;
                if(this.escalaTermometricaConvertida == 1){
                    celsius = (fahrenheit - 32) / 1.8;
                    System.out.println("Celsius: " + celsius);
                }
                else if (this.escalaTermometricaConvertida == 3){
                    kelvin =  (fahrenheit + 459.67) * (0.55);
                    System.out.println("Kelvin: " + kelvin);
                }
                else{
                    System.out.println("Digite uma opção válida!");
                }
                break;

            case 3:
                kelvin = this.temperaturaAtual;
                if (this.escalaTermometricaConvertida == 1){
                    celsius = kelvin - 273.15;
                    System.out.println("Celsius: " + celsius);
                }
                else if(this.escalaTermometricaConvertida == 2){
                    fahrenheit = 1.8 * (kelvin - 273) + 32;
                    System.out.println("Fahrenheit: " + fahrenheit);
                }
                else{
                    System.out.println("Digite uma opção válida!");
                }
                break;

            default:
                System.out.println("Informe um valor entre 1 e 3");
                break;
        }
    }

    @Override
    public String toString() {
        return "ConversorTemperatura{" +
                "temperaturaAtual=" + temperaturaAtual +
                ", escalaTermometricaAtual=" + escalaTermometricaAtual +
                ", escalaTermometricaConvertida=" + escalaTermometricaConvertida +
                '}';
    }
}
