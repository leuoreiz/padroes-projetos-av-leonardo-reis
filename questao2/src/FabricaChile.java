public final class FabricaChile implements iFabricaMatricula<Chile> {
    @Override
    public iDocumentoFiscal<Chile> criarDocumentoFiscal(double valorCurso) {
        return new BoletaElectronica(valorCurso);
    }

    @Override
    public iPagamento<Chile> criarPagamento() { return new Webpay(); }

    @Override
    public iComprovanteMatricula<Chile> criarComprovante(String nomeAluno, String identificacao) {
        return new ComprovanteChile(nomeAluno, identificacao);
    }
}
