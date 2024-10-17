import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Peso máximo da aeronave: ");
        int pesoMaximoAeronave = entrada.nextInt();

        int pesoTotalPassageiros = 0;
        boolean incluirNovoPassageiro= true;

//        while (true) { } Gera um loop infinito
        while (pesoTotalPassageiros <= pesoMaximoAeronave && incluirNovoPassageiro) {
            System.out.print("Peso do passageiro: ");

            int pesoPassageiro = entrada.nextInt();
            pesoTotalPassageiros += pesoPassageiro;

            System.out.print("Incluir um novo passageiro? ");
            incluirNovoPassageiro = entrada.nextBoolean();
        }

        System.out.printf("Peso máximo da aeronave: %d kg%n", pesoMaximoAeronave);
        System.out.printf("Peso total de passageiros: %d kg%n", pesoTotalPassageiros);
        System.out.printf("Situação da aeronave: %s%n", pesoTotalPassageiros > pesoMaximoAeronave ? "Peso Excedido\n Aeronave Bloqueada" : "Aeronave Liberada");
        entrada.close();
    }
}