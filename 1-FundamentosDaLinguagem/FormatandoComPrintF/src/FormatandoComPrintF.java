public class FormatandoComPrintF {
    public static void main(String[] args) {

        String nome = "Maria";
        System.out.printf("Olá, %s.%n", nome);

        int quantidade = 48;
        System.out.printf("Quantidade: %d itens.%n", quantidade );

        double peso1 = 938.22;
        System.out.printf("Peso: %f.%n", peso1);

        double altura = 1.75;
        System.out.printf("Altura: %.2f%n", altura);

        double peso2 = 400.59;
        System.out.printf("Peso: %10.2f%n", peso2);

    }
}