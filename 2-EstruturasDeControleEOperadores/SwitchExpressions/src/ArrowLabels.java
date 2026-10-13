import java.util.Scanner;

public class ArrowLabels {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um dia da semana(ex: seg, ter, qua, etc): ");
        String diaSemana = input.nextLine();

        System.out.print("Mês: ");
        int mes = input.nextInt();

//      Switch Expressions
        String horarioFuncionamento =
                switch (diaSemana) {
                    case "seg" -> {
                        if (mes == 12) {
                            yield "08:00 ás 16:00";
                        }
                        yield "Fechado";
                    }

                    case "ter", "qua", "qui", "sex" -> "08:00 ás 18:00";
                    case "sab", "dom" -> "08:00 ás 12:00";
                    default -> "Dia inválido";
        };

//      Arrow Labels
//      switch (diaSemana) {
//          case "seg" -> horarioFuncionamento = "Fechado";
//          case "ter", "qua", "qui", "sex" -> horarioFuncionamento = "08:00 ás 18:00";
//          case "sab", "dom" -> horarioFuncionamento = "08:00 ás 12:00";
//          default -> horarioFuncionamento = "Dia inválido";
//      }

        System.out.printf("Horário de funcionamento: %s%n", horarioFuncionamento);
        input.close();
    }
}
