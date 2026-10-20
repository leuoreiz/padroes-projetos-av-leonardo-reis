public class EmissorFerroviaria extends EmissorPassagem {
    @Override
    protected iPassagem criarPassagem(String passageiro, double tarifa) {
        return new PassagemFerroviaria(passageiro, tarifa);
    }
}
