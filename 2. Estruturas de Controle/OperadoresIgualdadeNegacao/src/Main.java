public class Main {
    public static void main(String[] args) {
        // boolean numerosIguais = 10 == 10;
        // boolean numerosIguais = (4 + 6) == (5 * 2);

        int numero1 = 10;
        int numero2 = 11;
        // boolean numerosIguais = numero1 == 10;
        boolean numerosIguais = numero1 == numero2;

        // boolean numeroDiferentes = !numerosIguais;
        boolean numeroDiferentes = (numero1 != numero2);

        System.out.printf("Numeros iguais: %b%n", numerosIguais);
        System.out.printf("Números diferentes: %b%n", numeroDiferentes);

        String nome1 = "Pedro";
        String nome2 = "Pedro";

        boolean nomesIguas = nome1 == nome2;
        System.out.printf("Nomes iguais: %b%n", nomesIguas);
    }
}