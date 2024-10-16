import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Dia da semana (ex: seg, ter, qua, etc): ");
        String diaDaSemana = entrada.nextLine();
        System.out.print("Mês: ");
        int mes = entrada.nextInt();

//        Modo de uso 01 (switch expression
        String horarioDeFuncionamento = switch (diaDaSemana) {
            case "seg" -> {
                if (mes == 12) {
                    yield "08:00 às 16:00";
                }
                yield "Fechado";
            }
            case "ter", "qua", "qui", "sex" -> "08:00 às 18:00";
            case "sab", "dom" -> "08:00 às 12:00";
//            É obrigatorio colocar o default na switch expression
            default -> "Dia Inválido";
        };

//        Modo de uso alternativo 02
//        String horarioDeFuncionamento;
//        switch (diaDaSemana) {
//            case "seg" -> horarioDeFuncionamento = "Fechado";
//            case "ter", "qua", "qui", "sex" -> horarioDeFuncionamento = "08:00 às 18:00";
//            case "sab", "dom" -> horarioDeFuncionamento = "08:00 às 12:00";
//            default -> horarioDeFuncionamento = "Dia Inválido";
//        }

        System.out.printf("Horário de funcionamento: %s%n", horarioDeFuncionamento);
        entrada.close();
    }
}