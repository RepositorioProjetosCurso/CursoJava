public class Aeronave {

    boolean ativo;
    int totalDeAssentos;
    int assentosReservados;

    int calculaAssenstosDisponiveis() {
        return totalDeAssentos - assentosReservados;
    }

    void reservarAssentos(int numeroAssentos) {
        if (ativo) {
            assentosReservados += numeroAssentos;
            System.out.printf("Assentos reservados: %d%n", assentosReservados);
        } else {
            // Forma melhor é com Exception
            System.out.println("Aeronave está desativada");
        }
    }

    void desativar() {
        ativo = false;
    }

    void ativar() {
        ativo = true;
    }
}
