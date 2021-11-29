/**
 * Classe que representa um livro culinário com os atributos herdados da classe Livro e
 * mais o seu respectivo atributo de tipoDeReceita que corresponde ao tipo de receita do livro.
 */
public class LivroCulinario extends Livro {
    private final String tipoDeReceita;

    /**
     * Método construtor da classe LivroCulinario, recebe como parâmetros os parâmetros herdados da classe Livro mais
     * o parâmetro tipoDeReceita, designado a partir do método da classe Livro generoDoLivro();.
     *
     * @param nome          String - Representa o nome do livro.
     * @param isbn          String - Representa o ISBN do livro.
     * @param autor         String - Representa o autor do livro.
     * @param resenha       String - Representa a resenha do livro.
     * @param tipoDeReceita String - Representa o tipo de receita do livro.
     */
    public LivroCulinario(String nome, String isbn, String autor, String resenha, String tipoDeReceita) {
        super(nome, isbn, autor, resenha);
        this.generoLivro = generoDoLivro();
        this.tipoDeReceita = tipoDeReceita;
    }

    /**
     * Método sobrescrito da classe Livro, para ser designado o gênero do livro.
     *
     * @return String - Retorna o gênero do livro.
     */
    @Override
    public String generoDoLivro() {
        return "Culinária";
    }

    /**
     * Método de sobrescrita do objeto LivroCulinario, a partir deste toString, conseguimos imprimir os dados do objeto em vez do seu hashcode.
     *
     * @return String - Retorna as informações do objeto LivroCulinario em formato de String e não em hashcode.
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nTipo de receita: " + tipoDeReceita +
                "\n----------------------------------------";
    }
}
