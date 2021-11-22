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
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                ", resenha='" + resenha + '\'' +
                ", generoLivro='" + generoLivro + '\'' +
                '}';
    }

    public abstract String generoDoLivro();

}
