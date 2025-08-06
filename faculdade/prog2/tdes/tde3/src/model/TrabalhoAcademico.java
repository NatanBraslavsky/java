package model;

public class TrabalhoAcademico extends ItemBiblioteca {
    private String instituicao;

    public TrabalhoAcademico(String titulo, String autor, int anoPublicacao, String instituicao) {
        super(titulo, autor, anoPublicacao);
        this.instituicao = instituicao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Trabalho Acadêmico: " + getTitulo() + " | Autor: " + getAutor() + " | Ano: " + getAnoPublicacao() + " | Instituição: " + instituicao);
    }
}
