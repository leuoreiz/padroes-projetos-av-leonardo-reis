public class ComprovanteBrasil implements iComprovanteMatricula<Brasil> {
    private String nomeAluno;
    private String identificacao;

    public ComprovanteBrasil(String nomeAluno, String identificacao) {
        this.nomeAluno = nomeAluno;
        this.identificacao = identificacao;
    }

    @Override
    public String descrever() {
        return "Comprovante de matrícula - Brasil; aluno: " + nomeAluno
            + "; CPF: " + identificacao;
    }
}
