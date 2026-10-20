public class EmissorRodoviaria extends EmissorPassagem {
    @Override
    protected iPassagem criarPassagem(String passageiro, double tarifa) {
        return new PassagemRodoviaria(passageiro, tarifa);
    }
}
