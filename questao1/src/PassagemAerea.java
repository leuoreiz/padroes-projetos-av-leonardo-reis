public class PassagemAerea implements iPassagem {
    private String passageiro;
    private double tarifa;

    public PassagemAerea(String passageiro, double tarifa) {
        this.passageiro = passageiro;
        this.tarifa = tarifa;
    }

    @Override
    public String getModal() { return "Aéreo"; }

    @Override
    public String getPassageiro() { return passageiro; }

    @Override
    public double calcularTaxaEmbarque() { return tarifa * 0.08; }

    @Override
    public String getDocumentos() { return "Documento de identidade com foto e bilhete eletrônico (e-ticket)"; }
}
