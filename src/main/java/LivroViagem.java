/**
 * Classe que representa um livro de viagens com os atributos herdados da classe Livro e
 * mais o seu respectivo atributo de local que corresponde ao local abordado no livro.
 */
public class LivroViagem extends Livro {
    private final String local;

    /**
     * @param nome    String - Representa o nome do livro.
     * @param isbn    String - Representa o ISBN do livro.
     * @param autor   String - Representa o autor do livro.
     * @param resenha String - Representa a resenha do livro.
     * @param local   String - Representa o local o qual é abordado no livro.
     */
    public LivroViagem(String nome, String isbn, String autor, String resenha, String local) {
        super(nome, isbn, autor, resenha);
        this.generoLivro = generoDoLivro();
        this.local = local;
    }

    /**
     * Método sobrescrito da classe Livro, para ser designado o gênero do livro.
     *
     * @return String - Retorna o gênero do livro.
     */
    @Override
    public String generoDoLivro() {
        return "Viagem";
    }

    /**
     * Método de sobrescrita do objeto LivroViagem, a partir deste toString, conseguimos imprimir os dados do objeto em vez do seu hashcode.
     *
     * @return String - Retorna as informações do objeto LivroViagem em formato de String e não em hashcode.
     */
    @Override
    public String toString() {
        return super.toString() +
                "\nLocal: " + local +
                "\n----------------------------------------";
    }
}
