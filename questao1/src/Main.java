public class Main {
    public static void main(String[] args) {
        EmissorPassagem aereo = new EmissorAerea();
        EmissorPassagem rodoviario = new EmissorRodoviaria();
        EmissorPassagem ferroviario = new EmissorFerroviaria();

        aereo.emitir("Leonardo Reis ", 1000);
        rodoviario.emitir("Ana Silva", 200);
        ferroviario.emitir("Carlos Souza", 300);
    }
}
