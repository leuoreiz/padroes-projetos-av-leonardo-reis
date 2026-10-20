public class PassagemRodoviaria implements iPassagem {
    private String passageiro;
    private double tarifa;

    public PassagemRodoviaria(String passageiro, double tarifa) {
        this.passageiro = passageiro;
        this.tarifa = tarifa;
    }

    @Override
    public String getModal() { return "Rodoviário"; }

    @Override
    public String getPassageiro() { return passageiro; }

    @Override
    public double calcularTaxaEmbarque() { return tarifa * 0.03; }

    @Override
    public String getDocumentos() { return "Documento de identidade com foto"; }
}
