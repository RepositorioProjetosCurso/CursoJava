import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um dia da semana (ex: seg, ter, qua, etc: ");
        String diaDaSemana = entrada.nextLine();
        String horarioDeFuncionamento;

        switch (diaDaSemana) {
            case "seg":
                horarioDeFuncionamento = "Fechado";
                break;
            case "ter":
            case "qua":
            case "qui":
            case "sex":
                horarioDeFuncionamento = "08:00 às 18:00";
                break;
            case "sab":
            case "dom":
                horarioDeFuncionamento = "08:00 às 12:00";
                break;
            default:
                horarioDeFuncionamento = "Dia Inválido";
        }

        System.out.printf("Horário de funcionamento: %s%n", horarioDeFuncionamento);
        entrada.close();
    }
}