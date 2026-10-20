public class PassagemFerroviaria implements iPassagem {
    private String passageiro;
    private double tarifa;

    public PassagemFerroviaria(String passageiro, double tarifa) {
        this.passageiro = passageiro;
        this.tarifa = tarifa;
    }

    @Override
    public String getModal() { return "Ferroviário"; }

    @Override
    public String getPassageiro() { return passageiro; }

    @Override
    public double calcularTaxaEmbarque() { return tarifa * 0.05; }

    @Override
    public String getDocumentos() { return "Documento de identidade com foto e comprovante de reserva"; }
}
