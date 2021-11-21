public class LivroViagem extends Livro {
    private String local;

    public LivroViagem(String nome, String isbn, String autor, String resenha, String local) {
        super(nome, isbn, autor, resenha);
        this.generoLivro = generoDoLivro();
        this.local = local;
    }

    @Override
    public String generoDoLivro() {
        return "Viagem";
    }
}