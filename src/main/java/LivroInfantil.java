/**
 * Classe que representa um livro infantil com os atributos herdados da classe Livro e
 * mais o seu respectivo atributo de brinde que corresponde ao brinde que vir� junto ao livro.
 */
public class LivroInfantil extends Livro {
    private final String brinde;

    /**
     * @param nome    String - Representa o nome do livro.
     * @param isbn    String - Representa o ISBN do livro.
     * @param autor   String - Representa o autor do livro.
     * @param resenha String - Representa a resenha do livro.
     * @param brinde  String - Representa o brinde que vem junto ao livro.
     */
    public LivroInfantil(String nome, String isbn, String autor, String resenha, String brinde) {
        super(nome, isbn, autor, resenha);
        this.generoLivro = generoDoLivro();
        this.brinde = brinde;
    }

    /**
     * M�todo sobrescrito da classe Livro, para ser designado o g�nero do livro.
     *
     * @return String - Retorna o g�nero do livro.
     */
    @Override
    public String generoDoLivro() {
        return "Infantil";
    }

    /**
     * M�todo de sobrescrita do objeto LivroInfantil, a partir deste toString, conseguimos imprimir os dados do objeto em vez do seu hashcode.
     *
     * @return String - Retorna as informa��es do objeto LivroInfantil em formato de String e n�o em hashcode.
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nBrinde: " + brinde +
                "\n----------------------------------------";
    }
}
