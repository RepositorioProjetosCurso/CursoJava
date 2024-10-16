import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Peso máximo da aeronave: ");
        int pesoMaximoAeronave = entrada.nextInt();

        System.out.print("Quantidade de passageiros: ");
        int totalDePassageiros = entrada.nextInt();

        int pesoTotalPassageiros = 0;

        for (int passageiroAtual = 1; passageiroAtual <= totalDePassageiros; passageiroAtual++) {
            System.out.printf("Peso do passageiro #%d ",passageiroAtual);

            int pesoPassageiro = entrada.nextInt();
            pesoTotalPassageiros += pesoPassageiro;
        }

        System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximoAeronave);
        System.out.printf("Peso total de passageiros: %d kg%n", pesoTotalPassageiros);
        System.out.printf("Situação da aeronave: %s%n", pesoTotalPassageiros > pesoMaximoAeronave ? "Peso Excedido\n Aeronave Bloqueada" : "Aeronave Liberada");
        entrada.close();
    }
}