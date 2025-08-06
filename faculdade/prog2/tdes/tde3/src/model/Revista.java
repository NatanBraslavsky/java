package model;

public class Revista extends ItemBiblioteca {
    private int edicao;

    public Revista(String titulo, String autor, int anoPublicacao, int edicao) {
        super(titulo, autor, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Revista: " + getTitulo() + " | Autor: " + getAutor() + " | Ano: " + getAnoPublicacao() + " | Edição: " + edicao);
    }
}
