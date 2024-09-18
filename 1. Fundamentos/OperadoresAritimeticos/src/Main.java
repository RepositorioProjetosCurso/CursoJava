public class Main {

    public static void main(String[] args) {
        int minhaIdade = 47;
        int idadeCris = 21;

        //Adição
        int totalSomaIdades = minhaIdade + idadeCris;
        System.out.println("Idades Somadas: " + totalSomaIdades);

        //Subtração
        int totalSubtracaoIdades = minhaIdade - idadeCris;
        System.out.println("Total subtração idades: " + totalSubtracaoIdades);

        //Multiplicação
        int totalMultiplicacaoIdades = 2 * idadeCris;
        System.out.println("Idade da Cris multiplicada por 2: " + totalMultiplicacaoIdades);

        //Divisão
        double totalDivisaoidades = minhaIdade / 4.0;
        System.out.println("Minha idade dividida por 4: " + totalDivisaoidades);

        //Módulo
        int restoDivisao = 7 % 2;
        System.out.println("Resto da divisão (modulo): " + restoDivisao);
    }
}