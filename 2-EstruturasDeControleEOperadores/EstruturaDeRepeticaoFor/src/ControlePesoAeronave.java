import java.util.Scanner;

public class ControlePesoAeronave {
    public static void main(String[] args) {

        Scanner  input = new Scanner(System.in);

        System.out.print("Peso Máximo da aeronave: ");
        double pesoMaximo = input.nextDouble();

        System.out.print("Quantos passageiros: ");
        int totalPassageiros = input.nextInt();

        double pesoTotalPassageiros = 0;

        for (int i = 1; i <= totalPassageiros; i++) {
            System.out.printf("Peso do passageiro #%d: ", i);
            double pesoPassageiro = input.nextDouble();

            pesoTotalPassageiros += pesoPassageiro;
        }

        System.out.printf("Peso máximo da aeronave: %.2f Kg%n", pesoMaximo);
        System.out.printf("Peso total dos passageiros: %.2f Kg%n", pesoTotalPassageiros);
        System.out.printf("Situação da aeronave: %s%n", pesoTotalPassageiros > pesoMaximo? "Peso excedido." : "Liberada");

        input.close();
    }
}
