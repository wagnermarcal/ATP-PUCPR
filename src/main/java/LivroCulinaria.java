public class LivroCulinaria extends Livro {
    private String tipoDeReceita;

    public LivroCulinaria(String nome, String isbn, String autor, String resenha, String tipoDeReceita) {
        super(nome, isbn, autor, resenha);
        this.generoLivro = generoDoLivro();
        this.tipoDeReceita = tipoDeReceita;
    }

    @Override
    public String generoDoLivro() {
        return "Culinária";
    }

    @Override
    public String toString() {
        return super.toString() +
                "tipoDeReceita='" + tipoDeReceita + '\'' +
                '}';
    }
}
