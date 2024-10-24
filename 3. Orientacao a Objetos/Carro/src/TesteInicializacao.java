public class TesteInicializacao {
    public static void main(String[] args) {

        Carro novoCarro = new Carro();

        novoCarro.fabricante = "BMW";
        novoCarro.anoFabricacao = 2022;
        novoCarro.proprietario.nome = "Maria";

        Pessoa proprietarioAntigo = novoCarro.proprietario;

        novoCarro.proprietario = new Pessoa();

        System.out.println(novoCarro.fabricante);
        System.out.println(novoCarro.modelo);
        System.out.println(novoCarro.anoFabricacao);
        System.out.println(novoCarro.proprietario.nome);

    }
}
