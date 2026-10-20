import java.util.Locale;

public abstract class EmissorPassagem {
    protected abstract iPassagem criarPassagem(String passageiro, double tarifa);

    public final void emitir(String passageiro, double tarifa) {
        iPassagem passagem = criarPassagem(passageiro, tarifa);
        double taxa = passagem.calcularTaxaEmbarque();
        System.out.println("Modal: " + passagem.getModal());
        System.out.println("Passageiro: " + passagem.getPassageiro());
        System.out.printf(new Locale("pt", "BR"), "Taxa de embarque: R$ %.2f%n", taxa);
        System.out.println("Documentos: " + passagem.getDocumentos());
        System.out.println();
    }
}
