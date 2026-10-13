import java.util.Scanner;

public class ClausulaBreak {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Avalie nosso atendimendo (1 a 5): ");
        int nota =  input.nextInt();

        String descricaoNota;

//        if (nota == 1) {
//            descricaoNota = "Muito ruim.";
//        } else if (nota == 2) {
//            descricaoNota = "Ruim.";
//        } else if (nota == 3) {
//            descricaoNota = "Razoável.";
//        }  else if (nota == 4) {
//            descricaoNota = "Muito bom.";
//        }  else if (nota == 5) {
//            descricaoNota = "Excelente.";
//        } else {
//            descricaoNota = "Opção Inválida.";
//        }

        switch (nota){
            case 1:
                descricaoNota = "Muito ruim.";
                break;
            case 2:
                descricaoNota = "Ruim.";
                break;
            case 3:
                descricaoNota = "Razoável.";
                break;
            case 4:
                descricaoNota = "Muito bom.";
                break;
            case  5:
                descricaoNota = "Excelente.";
                break;
            default:
                descricaoNota = "Opção inválida.";
        }

        System.out.printf("Sua nota foi: %d - %s%n", nota, descricaoNota);

        input.close();
    }
}
