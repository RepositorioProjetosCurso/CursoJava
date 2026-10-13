public class OperadoresIgualdadeNegacao {
    public static void main(String[] args) {

        boolean numerosIguais = 10 == 10;
        System.out.printf("Número iguais 1: %b\n", numerosIguais);

        boolean numerosIguais2 = (4 + 6) == (5 * 2);
        System.out.printf("Número iguais 2: %b\n", numerosIguais2);

        int numero1 = 10;
        int numero2 = 12;

        boolean numerosIguais3 = numero1 == numero2;
        System.out.printf("Números iguais 3: %b\n", numerosIguais3);

        System.out.printf("Número %d é igual a %d: %b\n", numero1, numero2, (numero1 == numero2));

        boolean numerosDiferentes = !numerosIguais3;
        System.out.printf("Números diferentes:  %b\n", numerosDiferentes);

        boolean numerosDiferentes2 = !(numero1 == numero2);
        System.out.printf("Números diferentes: %b\n", numerosDiferentes2);

        boolean numerosDiferentes3 = numero1 != numero2;
        System.out.printf("Números diferentes: %b\n", numerosDiferentes3);

    }
}
