import java.util.Locale;

public class NFSe implements iDocumentoFiscal<Brasil> {
    private double valorCurso;

    public NFSe(double valorCurso) { this.valorCurso = valorCurso; }

    @Override
    public String descrever() {
        return String.format(new Locale("pt", "BR"),
            "NFS - ISS de 5%%; valor do curso: %.2f; imposto: %.2f",
            valorCurso, valorCurso * 0.05);
    }
}
