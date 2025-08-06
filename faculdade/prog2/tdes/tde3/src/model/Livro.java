package model;

public class Livro extends ItemBiblioteca {
    private String editora;

    public Livro(String titulo, String autor, int anoPublicacao, String editora) {
        super(titulo, autor, anoPublicacao);
        this.editora = editora;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Livro: " + getTitulo() + " | Autor: " + getAutor() + " | Ano: " + getAnoPublicacao() + " | Editora: " + editora);
    }
}
