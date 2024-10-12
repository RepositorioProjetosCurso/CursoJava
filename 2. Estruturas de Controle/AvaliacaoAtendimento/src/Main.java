import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a nota do atendimento (1 a 5): ");
        int notaSatisfacao = entrada.nextInt();

        String descricaoNota;

        switch (notaSatisfacao) {
            case 1:
                descricaoNota = "Muito Ruim";
                System.out.printf("Sua avaliação foi %s, muito obrigado(a) pela avaliação%n", descricaoNota);
                break;
            case 2:
                descricaoNota = "Ruim";
                System.out.printf("Sua avaliação foi %s, muito obrigado(a) pela avaliação%n", descricaoNota);
                break;
            case 3:
                descricaoNota = "Razoável";
                System.out.printf("Sua avaliação foi %s, muito obrigado(a) pela avaliação%n", descricaoNota);
                break;
            case 4:
                descricaoNota = "Bom";
                System.out.printf("Sua avaliação foi %s, muito obrigado(a) pela avaliação%n", descricaoNota);
                break;
            case 5:
                descricaoNota = "Muito Bom";
                System.out.printf("Sua avaliação foi %s, muito obrigado(a) pela avaliação%n", descricaoNota);
                break;
            default:
                descricaoNota = "Inválido";
                System.out.print("Você digitou um número inválido");
        }



        entrada.close();
    }
}