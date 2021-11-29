
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * Método main, responsável pela execução da JVM.
     *
     * @param args String[] - Argumentos do método.
     */
    public static void main(String[] args) {
        menuBiblioteca();
    }

    /**
     * Método responsável pelo menu da biblioteca, onde o usuário faz as seleções de opções a partir dos
     * switch / case para utilizar o programa de cadastro.
     */
    private static void menuBiblioteca() {
        List<Livro> biblioteca = new ArrayList<>();
        boolean isEnd = true;
        while (isEnd) {
            String opcoesMenu;
            String entradaUsuario;
            int opcaoMenuPrincipal;
            int opcaoMenuControle;
            opcoesMenu = "Menu\n" +
                    "1. Adicionar livro\n" +
                    "2. Exibir livros\n" +
                    "3. Excluir livros\n" +
                    "4. Gravar\n" +
                    "5. Recuperar\n" +
                    "9. Fim";
            entradaUsuario = JOptionPane.showInputDialog(opcoesMenu);
            opcaoMenuPrincipal = Controle.retornaInteiro(entradaUsuario);
            switch (opcaoMenuPrincipal) {
                case 1:
                    String opcoesLivros = "Selecione o tipo do livro que deseja adicionar\n" +
                            "1. Livro Infantil\n" +
                            "2. Livro Culinário\n" +
                            "3. Livro de Viagens";
                    entradaUsuario = JOptionPane.showInputDialog(opcoesLivros);
                    opcaoMenuControle = Controle.retornaInteiro(entradaUsuario);
                    switch (opcaoMenuControle) {
                        case 1:
                            addLivroInfantil(biblioteca);
                            break;
                        case 2:
                            addLivroCulinaria(biblioteca);
                            break;
                        case 3:
                            addLivroViagem(biblioteca);
                            break;
                    }
                    break;
                case 2:
                    if (!biblioteca.isEmpty()) {
                        for (Livro l : biblioteca) {
                            Livro listaDosLivros = (biblioteca.get(biblioteca.indexOf(l)));
                            JOptionPane.showMessageDialog(null, listaDosLivros);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Você ainda não cadastrou nenhum item!\n" +
                                "Tente adicioná-los ou recuperá-los");
                    }
                    break;
                case 3:
                    if (!biblioteca.isEmpty()) {
                        biblioteca.clear();
                        JOptionPane.showMessageDialog(null, "Livros excluídos com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Não há dados para serem limpos!");
                    }
                    break;
                case 4:
                    if (!biblioteca.isEmpty()) {
                        gravarDados(biblioteca);
                        JOptionPane.showMessageDialog(null, "Dados gravados com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Não há dados para serem gravados!");
                    }
                    break;
                case 5:
                    if (biblioteca.isEmpty()) {
                        biblioteca = recuperaDados();
                        JOptionPane.showMessageDialog(null, "Dados recuperados com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Não há dados para serem recuperados!");
                    }
                    break;
                case 9:
                    isEnd = false;
                    JOptionPane.showMessageDialog(null, "Fim do programa!");
                    break;
            }
        }
    }

    /**
     * Método responsável por armazenar os objetos no arquivo "livros.txt", os quais podem ser lidos e recuperados por uma InputStream.
     *
     * @param biblioteca List<Livro> - Representa uma lista de livros.
     */
    private static void gravarDados(List<Livro> biblioteca) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("livros.txt"));
            for (Livro livro : biblioteca) {
                outputStream.writeObject(livro);
            }
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método responsável por fazer a leitura e recuperar os objetos no arquivo "livros.txt", só é possível fazer a
     * recuperação se o arquivo existir e tiver objetos no mesmo.
     *
     * @return List<Livro> - Retorna uma lista de objetos do tipo Livro.
     */
    @SuppressWarnings("finally")
    public static ArrayList<Livro> recuperaDados() {
        ArrayList<Livro> livroCache = new ArrayList<>();
        ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream(new FileInputStream("livros.txt"));
            Object o;
            while ((o = inputStream.readObject()) != null) {
                if (o instanceof Livro) {
                    livroCache.add((Livro) o);
                }
            }
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (final IOException ex) {
                ex.printStackTrace();
            }
            return livroCache;
        }
    }

    /**
     * Método responsável por adicionar um livro do tipo LivroInfantil na lista de livros.
     *
     * @param biblioteca List<Livro> - Representa uma lista de livros.
     */
    private static void addLivroInfantil(List<Livro> biblioteca) {
        String inputNomeLivro = "Cadastro do Livro\n" + "Nome do livro:\n";
        String nome = JOptionPane.showInputDialog(inputNomeLivro);

        String inputIsbnLivro = "Cadastro do Livro\n" + "ISBN:\n";
        String isbn = JOptionPane.showInputDialog(inputIsbnLivro);

        String inputAutorLivro = "Cadastro do Livro\n" + "Autor:\n";
        String autor = JOptionPane.showInputDialog(inputAutorLivro);

        String inputResenhaLivro = "Cadastro do Livro\n" + "Resenha:\n";
        String resenha = JOptionPane.showInputDialog(inputResenhaLivro);

        String inputBrinde = "Cadastro do Livro\n" + "Brinde:\n";
        String brinde = JOptionPane.showInputDialog(inputBrinde);

        Livro livroInfantil = new LivroInfantil(nome, isbn, autor, resenha, brinde);

        biblioteca.add(livroInfantil);
    }

    /**
     * Método responsável por adicionar um livro do tipo LivroCulinaria na lista de livros.
     *
     * @param biblioteca List<Livro> - Representa uma lista de livros.
     */
    private static void addLivroCulinaria(List<Livro> biblioteca) {
        String inputNomeLivro = "Cadastro do Livro\n" + "Nome do livro:\n";
        String nome = JOptionPane.showInputDialog(inputNomeLivro);

        String inputIsbnLivro = "Cadastro do Livro\n" + "ISBN:\n";
        String isbn = JOptionPane.showInputDialog(inputIsbnLivro);

        String inputAutorLivro = "Cadastro do Livro\n" + "Autor:\n";
        String autor = JOptionPane.showInputDialog(inputAutorLivro);

        String inputResenhaLivro = "Cadastro do Livro\n" + "Resenha:\n";
        String resenha = JOptionPane.showInputDialog(inputResenhaLivro);

        String inputTipoReceita = "Cadastro do Livro\n" + "Tipo de receita:\n";
        String tipo = JOptionPane.showInputDialog(inputTipoReceita);

        Livro livroCulinaria = new LivroCulinario(nome, isbn, autor, resenha, tipo);

        biblioteca.add(livroCulinaria);
    }

    /**
     * Método responsável por adicionar um livro do tipo LivroViagem na lista de livros.
     *
     * @param biblioteca List<Livro> - Representa uma lista de livros.
     */
    private static void addLivroViagem(List<Livro> biblioteca) {
        String inputNomeLivro = "Cadastro do Livro\n" + "Nome do livro:\n";
        String nome = JOptionPane.showInputDialog(inputNomeLivro);

        String inputIsbnLivro = "Cadastro do Livro\n" + "ISBN:\n";
        String isbn = JOptionPane.showInputDialog(inputIsbnLivro);

        String inputAutorLivro = "Cadastro do Livro\n" + "Autor:\n";
        String autor = JOptionPane.showInputDialog(inputAutorLivro);

        String inputResenhaLivro = "Cadastro do Livro\n" + "Resenha:\n";
        String resenha = JOptionPane.showInputDialog(inputResenhaLivro);

        String inputLocal = "Cadastro do Livro\n" + "Local:\n";
        String local = JOptionPane.showInputDialog(inputLocal);

        Livro livroViagem = new LivroViagem(nome, isbn, autor, resenha, local);

        biblioteca.add(livroViagem);
    }
}
