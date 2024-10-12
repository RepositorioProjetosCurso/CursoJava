import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nomeCliente = entrada.nextLine();

        System.out.printf("Olá %s%n", nomeCliente);

        entrada.close();
    }
}