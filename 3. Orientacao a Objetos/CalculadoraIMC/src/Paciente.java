public class Paciente {

    double peso;
    double altura;

    IndiceMassaCorporal calcularIndiceMassaCorporea() {
        IndiceMassaCorporal imc = new IndiceMassaCorporal();
        imc.resultado = peso / (altura * altura);
        imc.peso = peso;
        imc.altura = altura;

        return imc;
    }
}
