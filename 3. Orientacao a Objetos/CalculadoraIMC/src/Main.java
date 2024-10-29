public class Main {
    public static void main(String[] args) {

        CalculadoraImc calculadoraImc1 = new CalculadoraImc();
        Paciente p1 = new Paciente();

        p1.altura = 1.52;
        p1.peso = 124.73;

        IndiceMassaCorporal imc = calculadoraImc1.calcular(p1);

        if(imc.estaComObesidade()) {
            System.out.printf("Paciente com altura %.2f e peso %.2f, está com obesidade%n", imc.altura, imc.peso);
        }

        System.out.printf("IMC: %.2f", imc.resultado);
    }
}