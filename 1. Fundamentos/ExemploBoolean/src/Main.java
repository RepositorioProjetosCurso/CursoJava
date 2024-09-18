public class Main {

    public static void main(String[] args) {
        boolean compraAprovada = true;
        boolean clienteBloqueado = false;

        System.out.println(compraAprovada);
        System.out.println(clienteBloqueado);

        int quantidadeEstoque = 18;
        int quantiadadeDeCompra = 15;

        boolean estoqueSuficiente = quantidadeEstoque >= quantiadadeDeCompra;
        System.out.println("Estoque suficiente: " + estoqueSuficiente);
    }
}