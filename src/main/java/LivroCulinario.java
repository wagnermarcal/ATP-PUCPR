public class LivroCulinario extends Livro {
    private String tipoDeReceita;

    public LivroCulinario(String nome, String isbn, String autor, String resenha, String tipoDeReceita) {
        super(nome, isbn, autor, resenha);
        this.generoLivro = generoDoLivro();
        this.tipoDeReceita = tipoDeReceita;
    }

    public void setTipoDeReceita(String tipoDeReceita) {
        this.tipoDeReceita = tipoDeReceita;
    }

    @Override
    public String generoDoLivro() {
        return "Culinária";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nTipo de receita: " + tipoDeReceita +
                "\n----------------------------------------";
    }
}
