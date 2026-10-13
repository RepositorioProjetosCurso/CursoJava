public class OperadoresComparacao {
    public static void main(String[] args) {

        int pesoProdutos = 900;
        int limietePesoCaminhao = 1000;

        boolean cargaExcedida = pesoProdutos >= limietePesoCaminhao;
        System.out.printf("Peso excedido: %b\n", cargaExcedida);

//      boolean cargaLiberada = pesoProdutos < limietePesoCaminhao;
//      boolean cargaLiberada = pesoProdutos <= limietePesoCaminhao;
        boolean cargaLiberada = limietePesoCaminhao >= pesoProdutos;
        System.out.printf("Carga liberada: %b\n", cargaLiberada);

    }
}
