public abstract class Livro {
    private String nome;
    private String isbn;
    private String autor;
    private String resenha;
    protected String generoLivro;


    public Livro() {
        this.nome = Controle.leString();
        this.isbn = Controle.leString();
        this.autor = Controle.leString();
        this.resenha = Controle.leString();
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
