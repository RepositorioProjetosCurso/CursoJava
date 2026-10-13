import java.util.Scanner;

public class ExameCortisol {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Cortisol: ");
        double cortisol = input.nextDouble();

        boolean resultadoNormal = cortisol >= 6.0 && cortisol <= 18.4;
        boolean resultadoAnormal = cortisol < 6.0 || cortisol > 18.4;

        System.out.printf("Cortisol normal: %b%n", resultadoNormal);
        System.out.printf("Cortisol Anormal: %b%n", resultadoAnormal);


        input.close();
    }
}