import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Peso: ");
        double pesoDoPaciente = entrada.nextDouble();
        System.out.print("Altura: ");
        double alturaDoPaciente = entrada.nextDouble();

        double imc = pesoDoPaciente / Math.pow(alturaDoPaciente, 2);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 25 ) {
            System.out.println("Peso Ideal");
        } else if (imc <= 30) {
            System.out.println("Acima do peso");
        } else if (imc <= 35) {
            System.out.println("Obesidade I");
        } else if (imc <= 40) {
            System.out.println("Obesidade II");
        } else {
            System.out.println("Obesidade III");
        }

        entrada.close();
    }
}