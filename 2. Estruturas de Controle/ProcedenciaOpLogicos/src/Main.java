public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

//        boolean resultado = x == 13 && x == 15 || y == 20; True
//        boolean resultado = (x == 13 && x == 15) || y == 20; True
        boolean resultado = x == 13 && (x == 15 || y == 20); // False
        System.out.println(resultado);
    }
}