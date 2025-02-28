class Carro extends Veiculo {
    protected String tipoCarro;
    protected static final double TANQUE = 50;
    protected static final double CONSUMO = 12;

    public Carro(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, String tipoCarro) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        if (!tipoCarro.equals("sedan") && !tipoCarro.equals("hatch") && !tipoCarro.equals("SUV")) {
            throw new IllegalArgumentException("Tipo de carro inválido");
        }
        this.tipoCarro = tipoCarro;
    }

    @Override
    public double calcularAutonomia() {
        return TANQUE * CONSUMO;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Tipo do Carro: " + tipoCarro);
    }
}
