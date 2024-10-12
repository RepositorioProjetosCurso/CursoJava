import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Peso: ");
        double pesoDoPaciente = entrada.nextDouble();
        System.out.print("Altura: ");
        double alturaDoPaciente = entrada.nextDouble();

        double imc = pesoDoPaciente / Math.pow(alturaDoPaciente, 2);

        if (imc < 18.5) {
            System.out.println("Está abaixo do peso ideal!");
            System.out.println("Procure um nutricionista");
        } if (imc >= 18.5 && imc < 25) {
            System.out.println("Você está no peso ideal");
            System.out.println("Parabéns");
        } if (imc >= 25 && imc < 30) {
            System.out.println("Você está acima do peso");
            System.out.println("Cuide da Saúde");
        } if (imc >= 30 && imc < 35) {
            System.out.println("Você tem Obesidade Grau I");
            System.out.println("Procure um nutricionista o quanto antes");
        } if (imc >= 35 && imc < 40) {
            System.out.println("Você tem Obesidade Grau II");
            System.out.println("Procure um nutricionista, rápido");
        } if (imc >= 40 ){
            System.out.println("Você tem Obesidade Grau III");
            System.out.println("Procure um se consultar com um nutri urgentemente");
        }

        System.out.printf("Seu IMC: %.2f%n", imc);
        System.out.println("Fim do Programa");
        entrada.close();
    }
}