import java.io.Serializable;

/**
 * Classe que representa um livro com os seus respectivos atributos, também há uma serialVersionUID, que
 * representa a versão de serialização dos objetos no arquivo "livros.txt", só é possível fazer a leitura
 * deste arquivo, caso a versão da serialVersionUID do arquivo seja a mesma desta classe.
 */
public abstract class Livro implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String nome;
    private final String isbn;
    private final String autor;
    private final String resenha;
    protected String generoLivro;

    /**
     * Método construtor da classe Livro.
     *
     * @param nome    String - Representa o nome do livro.
     * @param isbn    String - Representa o ISBN do livro.
     * @param autor   String - Representa o autor do livro.
     * @param resenha String - Representa a resenha do livro.
     */
    public Livro(String nome, String isbn, String autor, String resenha) {
        this.nome = nome;
        this.isbn = isbn;
        this.autor = autor;
        this.resenha = resenha;
    }

    /**
     * Método de sobrescrita do objeto Livro, a partir deste toString, conseguimos imprimir os dados de um objeto em vez do seu hashcode.
     *
     * @return String - Retorna as informações do objeto em formato de String e não em hashcode.
     */
    @Override
    public String toString() {
        return "\n----------------------------------------" +
                "\nGênero do Livro: " + generoLivro +
                "\nNome: " + nome +
                "\nISBN: " + isbn +
                "\nAutor: " + autor +
                "\nResenha: " + resenha;
    }

    /**
     * Método da classe mãe para que os filhos herdem a classe e designem o gênero do livro ao respectivo.
     *
     * @return String - Retorna o gênero do livro.
     */
    public abstract String generoDoLivro();
}
