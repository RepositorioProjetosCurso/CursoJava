import java.util.Scanner;

public class EstruturaElse {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Peso: ");
        int peso = entrada.nextInt();

        System.out.print("Altura: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

//      Estrutura somente com else(Dificil leitura).
        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal.");
        } else {
            if (imc < 25) {
                System.out.println("Peso ideal.");
            } else {
                if (imc < 30) {
                    System.out.println("Acima do peso.");
                }
            }
        }

        System.out.println("Fim do programa.");

        entrada.close();
    }
}
