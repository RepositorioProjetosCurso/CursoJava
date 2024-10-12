import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Preço dos Produtos: ");
        double precoPorProduto = entrada.nextDouble();

        System.out.print("Cobrar frete? ");
        boolean cobraFrete = entrada.nextBoolean();

        double valorFrete = 0;

        if (cobraFrete) {
            System.out.print("Valor do frete: ");
            valorFrete = entrada.nextDouble();
        } else {
            valorFrete = 0;
        }

        double valorTotal = precoPorProduto + valorFrete;
        System.out.printf("Valor total da compra: %.2f%n", valorTotal);

        entrada.close();
    }
}