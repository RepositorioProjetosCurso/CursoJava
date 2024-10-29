public class Main {
    public static void main(String[] args) {

        Paciente paciente1 = new Paciente();

        paciente1.altura = 1.75;
        paciente1.peso = 98.80;

        IndiceMassaCorporal imc = paciente1.calcularIndiceMassaCorporea();
        System.out.printf("IMC: %.2f", imc.resultado);
    }
}