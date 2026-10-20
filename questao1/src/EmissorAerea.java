public class EmissorAerea extends EmissorPassagem {
    @Override
    protected iPassagem criarPassagem(String passageiro, double tarifa) {
        return new PassagemAerea(passageiro, tarifa);
    }
}
