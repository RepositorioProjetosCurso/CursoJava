public class Main {
    public static void main(String[] args) {

        CalculadoraImc calculadoraImc1 = new CalculadoraImc();

        calculadoraImc1.altura = 1.75;
        calculadoraImc1.peso = 98.80;

        IndiceMassaCorporal imc = calculadoraImc1.calcular();

        if(imc.estaComObesidade()) {
            System.out.printf("CalculadoraImc com altura %.2f e peso %.2f, está com obesidade%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f", imc.resultado);
    }
}