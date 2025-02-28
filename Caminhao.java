class Caminhao extends Veiculo {
    protected double capacidadeCarga;
    protected static final double TANQUE = 300;
    protected static final double CONSUMO_BASE = 6;

    public Caminhao(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double capacidadeCarga) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        if (capacidadeCarga < 0) throw new IllegalArgumentException("Capacidade de carga inválida");
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularAutonomia() {
        double reducao = Math.min(capacidadeCarga, 25) * 0.01;
        return TANQUE * (CONSUMO_BASE * (1 - reducao));
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Capacidade de Carga: " + capacidadeCarga + " toneladas");
    }
}
