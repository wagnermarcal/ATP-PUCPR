public class LivroCulinaria extends Livro {
    private String tipoDeReceita;

    public LivroCulinaria(String tipoDeReceita) {
        this.tipoDeReceita = tipoDeReceita;
    }

    @Override
    public String generoDoLivro() {
        return "Culinária";
    }

}
