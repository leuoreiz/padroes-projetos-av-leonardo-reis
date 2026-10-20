public final class FabricaBrasil implements iFabricaMatricula<Brasil> {
    @Override
    public iDocumentoFiscal<Brasil> criarDocumentoFiscal(double valorCurso) {
        return new NFSe(valorCurso);
    }

    @Override
    public iPagamento<Brasil> criarPagamento() { return new Pix(); }

    @Override
    public iComprovanteMatricula<Brasil> criarComprovante(String nomeAluno, String identificacao) {
        return new ComprovanteBrasil(nomeAluno, identificacao);
    }
}
