import java.util.Locale;

public class BoletaElectronica implements iDocumentoFiscal<Chile> {
    private double valorCurso;

    public BoletaElectronica(double valorCurso) { this.valorCurso = valorCurso; }

    @Override
    public String descrever() {
        return String.format(new Locale("pt", "BR"),
            "Boleta electrónica - IVA de 19%%; valor do curso: %.2f; imposto: %.2f",
            valorCurso, valorCurso * 0.19);
    }
}
