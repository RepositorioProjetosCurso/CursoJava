import java.util.Scanner;

public class ControlePesoAeronave {
    public static void main(String[] args) {

        Scanner  input = new Scanner(System.in);

        System.out.print("Peso Máximo da aeronave: ");
        double pesoMaximo = input.nextDouble();

        double pesoTotalPassageiros = 0;
        boolean incluirNovoPassageiro = true;

        while (pesoTotalPassageiros <= pesoMaximo && incluirNovoPassageiro) {
            System.out.print("Peso do passageiro #%d: ");
            double pesoPassageiro = input.nextDouble();

            pesoTotalPassageiros += pesoPassageiro;

            if (pesoTotalPassageiros < pesoMaximo) {
                System.out.print("Incluir novo passageiro? ");
                incluirNovoPassageiro = input.nextBoolean();
            } else {
                incluirNovoPassageiro = false;
            }
        }

        System.out.printf("Peso máximo da aeronave: %.2f Kg%n", pesoMaximo);
        System.out.printf("Peso total dos passageiros: %.2f Kg%n", pesoTotalPassageiros);
        System.out.printf("Situação da aeronave: %s%n", pesoTotalPassageiros > pesoMaximo? "Peso excedido." : "Liberada");

        input.close();
    }
}
