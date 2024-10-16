public class Main {
    public static void main(String[] args) {
        char tipoNotaFiscal = 'S';
        double totalFaturado = 1200.30;

//        Forma normal de se fazer
//        double valorImpostos;
//        if (tipoNotaFiscal == 'S') {
//            valorImpostos = totalFaturado * 0.16;
//        } else {
//            valorImpostos = totalFaturado * 0.35;
//        }

//        Operador ternario
        double valorImpostos = tipoNotaFiscal == 'S' ? totalFaturado * 0.16 : totalFaturado * 0.35;
        System.out.printf("Total faturado: %.2f%n", totalFaturado);
        System.out.printf("Valor dos impostos: %.2f%n", valorImpostos);
    }
}