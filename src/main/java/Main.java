import com.sun.security.jgss.GSSUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Livro> biblioteca = new ArrayList<>();
        boolean isEnd = true;
        while (isEnd) {
            System.out.println("1. Adicionar livro");
            System.out.println("2. Exibir livros");
            System.out.println("3. Excluir livros");
            System.out.println("4. Gravar");
            System.out.println("5. Recuperar");
            System.out.println("9. Fim");
            int opcaoUsuario = Controle.leInteiro();
            Controle.leString();
            switch (opcaoUsuario) {
                case 1:
                    System.out.println("1. Livro Infantil");
                    System.out.println("2. Livro Culinário");
                    System.out.println("3. Livro de Viagens");
                    int entradaUsuario = Controle.leInteiro();
                    Controle.leString();
                    switch (entradaUsuario) {
                        case 1:
                            addLivroInfantil(biblioteca);
                            break;
                        case 2:
                            addLivroCulinario(biblioteca);
                            break;
                        case 3:
                            addLivroViagem(biblioteca);
                            break;
                    }
                    break;
                case 2:
                    for (Livro l : biblioteca) {
                        System.out.println(biblioteca.get(biblioteca.indexOf(l)));
                    }
                    break;
                case 3:
                    biblioteca.clear();
                    break;
                case 4:
                    gravarDados(biblioteca);
                    break;
                case 5:
                    biblioteca = recuperaDados();
                    break;
                case 9:
                    isEnd = false;
                    break;
            }
        }
    }

    private static void gravarDados(List<Livro> biblioteca) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("arq1.txt"));
            for (int i = 0; i < biblioteca.size(); i++) {
                outputStream.writeObject(biblioteca.get(i));
            }
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return;
    }

    @SuppressWarnings("finally")
    public static ArrayList<Livro> recuperaDados() {
        ArrayList<Livro> livroCache = new ArrayList<Livro>();
        ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream(new FileInputStream("arq1.txt"));
            Object o = null;
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

    private static void addLivroInfantil(List<Livro> biblioteca) {
        System.out.println("Nome do livro: ");
        String nome = Controle.leString();
        System.out.println("ISBN: ");
        String isbn = Controle.leString();
        System.out.println("Autor: ");
        String autor = Controle.leString();
        System.out.println("Resenha: ");
        String resenha = Controle.leString();
        System.out.println("Brinde: ");
        String caracteristica = Controle.leString();
        Livro livro = new LivroInfantil(nome, isbn, autor, resenha, caracteristica);
        biblioteca.add(livro);
    }

    private static void addLivroCulinario(List<Livro> biblioteca) {
        System.out.println("Nome do livro: ");
        String nome = Controle.leString();
        System.out.println("ISBN: ");
        String isbn = Controle.leString();
        System.out.println("Autor: ");
        String autor = Controle.leString();
        System.out.println("Resenha: ");
        String resenha = Controle.leString();
        System.out.println("Tipo de receita: ");
        String caracteristica = Controle.leString();
        Livro livro = new LivroCulinaria(nome, isbn, autor, resenha, caracteristica);
        biblioteca.add(livro);
    }

    private static void addLivroViagem(List<Livro> biblioteca) {
        System.out.println("Nome do livro: ");
        String nome = Controle.leString();
        System.out.println("ISBN: ");
        String isbn = Controle.leString();
        System.out.println("Autor: ");
        String autor = Controle.leString();
        System.out.println("Resenha: ");
        String resenha = Controle.leString();
        System.out.println("Local: ");
        String caracteristica = Controle.leString();
        Livro livro = new LivroViagem(nome, isbn, autor, resenha, caracteristica);
        biblioteca.add(livro);
    }
}
