import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entra = new Scanner(System.in);

        System.out.print("Nome: ");
        String nomePaciente = entra.nextLine();

        System.out.print("Peso: ");
        double pesoPaciente = entra.nextDouble();

        System.out.print("Altura: ");
        double alturaPaciente = entra.nextDouble();

        // O nextLine lê a proxima coisa que vier, mesmo sendo um enter ou espaço
        // entra.nextLine(); <-- É feito isso para corrigir o erro do nextLine
//        System.out.print("Nome: ");
//        String nomePaciente = entra.nextLine();

        double imc = pesoPaciente / (alturaPaciente * alturaPaciente);
        System.out.printf("O IMC de %s é: %.2f", nomePaciente, imc);

        entra.close();
    }
}