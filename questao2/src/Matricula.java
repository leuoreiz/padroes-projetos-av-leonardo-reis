public class Matricula<P extends iPais> {
    private final iFabricaMatricula<P> fabrica;

    public Matricula(iFabricaMatricula<P> fabrica) {
        this.fabrica = fabrica;
    }

    public void confirmar(String nomeAluno, String identificacao, double valorCurso) {
        iDocumentoFiscal<P> documento = fabrica.criarDocumentoFiscal(valorCurso);
        iPagamento<P> pagamento = fabrica.criarPagamento();
        iComprovanteMatricula<P> comprovante = fabrica.criarComprovante(nomeAluno, identificacao);

        System.out.println(documento.descrever());
        System.out.println(pagamento.descrever());
        System.out.println(comprovante.descrever());
        System.out.println();
    }
}
