import java.util.Scanner;

public class ControlePesoAeronave {
    public static void main(String[] args) {

        Scanner  input = new Scanner(System.in);

        System.out.print("Peso Máximo da aeronave: ");
        double pesoMaximo = input.nextDouble();

        double pesoTotalPassageiros = 0;

        while (true) {
            System.out.print("Peso do passageiro #%d: ");
            double pesoPassageiro = input.nextDouble();

            if (pesoPassageiro + pesoPassageiro > pesoMaximo) {
                System.out.println("Peso excedeu o máximo. Inclua outro passageiro.");
                continue;
            }

            pesoTotalPassageiros += pesoPassageiro;

            System.out.print("Incluir novo passageiro? ");
            if (!input.nextBoolean()) {
                break;
            }
        }

        System.out.printf("Peso máximo da aeronave: %.2f Kg%n", pesoMaximo);
        System.out.printf("Peso total dos passageiros: %.2f Kg%n", pesoTotalPassageiros);
        System.out.printf("Situação da aeronave: %s%n", pesoTotalPassageiros > pesoMaximo? "Peso excedido." : "Liberada");

        input.close();
    }
}
