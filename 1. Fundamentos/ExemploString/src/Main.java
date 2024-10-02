public class Main {

    public static void main(String[] args) {
        System.out.println("Olá mergulhador!");

        int x = 10;
        int y = 5;

        // Ele começa o trabalho com uma String e identifica que é para concatenar
        System.out.println("O resultado é: " + x + y);

        // Ele identifica que é primeiro uma operação, e logo sem seguida que também é para concatenar
        System.out.println(x + y + " É o resultado\n" +
                "mn");

        String nomePaciente = "Claudia";
        int idadePaciente = 42;

        System.out.println("Paciente é a " + nomePaciente + " e sua idade é: " + idadePaciente);
    }
}