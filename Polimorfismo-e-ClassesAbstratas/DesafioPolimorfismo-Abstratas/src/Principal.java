import com.algaworks.impostos.*;

public class Principal {
    public static void main(String[] args) {
        GestorDeImpostos gestor = new GestorDeImpostos();

        Pessoa p1 = new PessoaFisica("Ana", 4000); // isenta
        Pessoa p2 = new PessoaFisica("Carlos", 20000); // paga 20% = 4000
        Pessoa p3 = new EmpresaSimples("Padaria", 100000, 20000); // 6% de 100000 = 6000
        Pessoa p4 = new EmpresaLucroReal("Fábrica", 500000, 300000); // lucro = 200000, imposto = 50000

        gestor.adicionar(p1);
        gestor.adicionar(p2);
        gestor.adicionar(p3);
        gestor.adicionar(p4);

        System.out.println("Total de impostos: " + gestor.getValorTotalImpostos());
    }
}
