public class ComprovanteChile implements iComprovanteMatricula<Chile> {
    private String nomeAluno;
    private String identificacao;

    public ComprovanteChile(String nomeAluno, String identificacao) {
        this.nomeAluno = nomeAluno;
        this.identificacao = identificacao;
    }

    @Override
    public String descrever() {
        return "Comprovante de matrícula - Chile; aluno: " + nomeAluno
            + "; RUT: " + identificacao;
    }
}
