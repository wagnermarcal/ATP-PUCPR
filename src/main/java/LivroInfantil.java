public class LivroInfantil extends Livro {
    private String brinde;

    public LivroInfantil(String nome, String isbn, String autor, String resenha, String brinde) {
        super(nome, isbn, autor, resenha);
        this.generoLivro = generoDoLivro();
        this.brinde = brinde;
    }

    public void setBrinde(String brinde) {
        this.brinde = brinde;
    }

    @Override
    public String generoDoLivro() {
        return "Infantil";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nBrinde: " + brinde +
                "\n----------------------------------------";
    }
}
