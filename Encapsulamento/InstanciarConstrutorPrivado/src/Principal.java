import com.algaworks.matematica.CalculadoraArea;

public class Principal {
    public static void main(String[] args) {
        double areaQuadrado = CalculadoraArea.calcularAreaQuadrado(20);
        double areaCirculo = CalculadoraArea.calcularAreaCirculo(5.5);

        System.out.printf("PI: %.2f%n", CalculadoraArea.PI);
        System.out.printf("Área do quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do círculo: %.2f%n", areaCirculo);
    }
}
