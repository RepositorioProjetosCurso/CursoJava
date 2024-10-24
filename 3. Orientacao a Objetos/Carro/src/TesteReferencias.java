public class TesteReferencias {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Pedro";

        Pessoa p2 = new Pessoa();
        p2.nome = "Maria";

        Carro carro1 = new Carro();
        carro1.modelo = "HR-V";

        Carro carro2 = new Carro();
        carro2.modelo = "X6";

        carro1.proprietario = p1;
        carro2.proprietario = p1;

        carro1.proprietario.nome = "Julio";

        System.out.println(carro1.proprietario.nome);
        System.out.println(carro2.proprietario.nome);
    }
}
