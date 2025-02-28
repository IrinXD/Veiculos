public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Toyota", "Corolla", 2022, 5, "Gasolina", "sedan");
        carro.exibirDetalhes();
        System.out.println("Autonomia: " + carro.calcularAutonomia() + " km\n");


        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2020, 2, "Diesel", 5);
        caminhao.exibirDetalhes();
        System.out.println("Autonomia: " + caminhao.calcularAutonomia() + " km\n");


        Onibus onibus = new Onibus("Mercedes", "O500", 2019, 40, "Diesel", 6);
        onibus.exibirDetalhes();
        System.out.println("Autonomia: " + onibus.calcularAutonomia() + " km\n");


        CarroEletrico tesla = new CarroEletrico("Tesla", "Model S", 2023, 5, "sedan", 100);
        tesla.exibirDetalhes();
        System.out.println("Autonomia: " + tesla.calcularAutonomia() + " km\n");

        CaminhaoRefrigerado frigorifico = new CaminhaoRefrigerado("Scania", "R450", 2021, 2, "Diesel", 10, -20);
        frigorifico.exibirDetalhes();
        System.out.println("Autonomia: " + frigorifico.calcularAutonomia() + " km\n");
    }
}
