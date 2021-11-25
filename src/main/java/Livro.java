import java.io.Serializable;

public abstract class Livro implements Serializable {
    private final String nome;
    private final String isbn;
    private final String autor;
    private final String resenha;
    protected String generoLivro;

    public Livro(String nome, String isbn, String autor, String resenha) {
        this.nome = nome;
        this.isbn = isbn;
        this.autor = autor;
        this.resenha = resenha;
    }

    @Override
    public String toString() {
        return "\n----------------------------------------" +
                "\nGênero do Livro: " + generoLivro +
                "\nNome: " + nome +
                "\nISBN: " + isbn +
                "\nAutor: " + autor +
                "\nResenha: " + resenha;
    }

    public abstract String generoDoLivro();

}
