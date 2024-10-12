public class Main {

    public static void main(String[] args) {
        int pesoProduto = 900;
        int limiteDePesoCaminhao = 1000;

        boolean excedeCarga = pesoProduto > limiteDePesoCaminhao;
        System.out.printf("O limite de peso está excedido? %b%n", excedeCarga);


//        boolean cargaLiberada = pesoProduto < limiteDePesoCaminhao;
//        boolean cargaLiberada = pesoProduto <= limiteDePesoCaminhao;
        boolean cargaLiberada = limiteDePesoCaminhao >= pesoProduto;
        System.out.printf("Carga está liberada: %b%n", cargaLiberada);
    }
}