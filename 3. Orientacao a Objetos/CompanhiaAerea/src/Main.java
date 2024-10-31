public class Main {
    public static void main(String[] args) {

        Aeronave aviaoGol = new Aeronave();
        aviaoGol.totalDeAssentos = 450;
        aviaoGol.ativar();

        aviaoGol.reservarAssentos(80);

        System.out.printf("GOL (%s): %d Assentons disponiveis%n", aviaoGol.ativo ? "Ativo" : "Inativo", aviaoGol.calculaAssenstosDisponiveis());
        System.out.println();

        Aeronave aviaoLatam = new Aeronave();
        aviaoLatam.totalDeAssentos = 410;
        aviaoLatam.desativar();

        aviaoLatam.reservarAssentos(50);

        System.out.printf("LATAM (%s): %d Assentos disponiveis%n", aviaoLatam.ativo ? "Ativo" : "Inativo", aviaoLatam.calculaAssenstosDisponiveis());
    }
}