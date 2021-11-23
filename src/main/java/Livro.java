import java.io.Serializable;

public abstract class Livro implements Serializable {
    private String nome;
    private String isbn;
    private String autor;
    private String resenha;
    protected String generoLivro;

    public Livro(String nome, String isbn, String autor, String resenha) {
        this.nome = nome;
        this.isbn = isbn;
        this.autor = autor;
        this.resenha = resenha;
    }

    @Override
    public String toString() {
        return  "\n----------------------------------------" +
                "\nNome: " + nome +
                "\nISBN: " + isbn +
                "\nAutor: " + autor +
                "\nResenha: " + resenha +
                "\nGênero do Livro: " + generoLivro;
    }

    public abstract String generoDoLivro();

}
