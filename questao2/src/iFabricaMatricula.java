public interface iFabricaMatricula<P extends iPais> {
    iDocumentoFiscal<P> criarDocumentoFiscal(double valorCurso);
    iPagamento<P> criarPagamento();
    iComprovanteMatricula<P> criarComprovante(String nomeAluno, String identificacao);
}
