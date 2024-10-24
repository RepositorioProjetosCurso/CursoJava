public class Principal {

    public static void main(String[] args) {

        Pessoa eu = new Pessoa();
        eu.nome = "Roberto Paiva";
        eu.cpf = "033.884.951-51";  // Forma de Criar um proprietario 01
        eu.anoNascimento = 1981;

        Pessoa voce = new Pessoa();
        voce.nome = "João Claudio";
        voce.cpf = "953.351.751-03";
        voce.anoNascimento = 1998;

        Carro meuCarro = new Carro();
        meuCarro.fabricante = "BMW";
        meuCarro.modelo = "X6";
        meuCarro.anoFabricacao = 2023;
        meuCarro.cor = "Preto";
//      Proprietario do  meu carro
        meuCarro.proprietario = eu;

//      meuCarro.proprietario = new Pessoa();  // Para que exista um proprietario para meu carro, e ele não seja nulo
//      meuCarro.proprietario.nome = "Roberto Paiva";
//      meuCarro.proprietario.cpf = "033.884.951-51";  // Forma de Criar um proprietario 02
//      meuCarro.proprietario.anoNascimento = 1981;

        Carro seuCarro = new Carro();
        seuCarro.fabricante = "Fiat";
        seuCarro.modelo = "Fastback";
        seuCarro.anoFabricacao = 2024;
        seuCarro.cor = "Azul";
//      Proprietario do seu carro
        seuCarro.proprietario = voce;

//      seuCarro.proprietario = new Pessoa();  // Para que exista um proprietario para seu carro, e ele não seja nulo
//      seuCarro.proprietario.nome = "João Claudio";
//      seuCarro.proprietario.cpf = "953.351.751-03";
//      seuCarro.proprietario.anoNascimento = 1998;

        System.out.println("Meu Carro");
        System.out.println("---------");
        System.out.printf("Modelo: %s%n", meuCarro.modelo);
        System.out.printf("Ano: %d%n", meuCarro.anoFabricacao);
        System.out.printf("Proprietario: %s%n", meuCarro.proprietario.nome);

        System.out.println();

        System.out.println("Seu Carro");
        System.out.println("---------");
        System.out.printf("Modelo: %s%n", seuCarro.modelo);
        System.out.printf("Ano: %d%n", seuCarro.anoFabricacao);
        System.out.printf("Proprietario: %s%n", seuCarro.proprietario.nome);
    }
}
