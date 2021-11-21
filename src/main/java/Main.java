import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Livro> biblioteca = new ArrayList<>();
        boolean isEnd = true;
        while (isEnd) {
            System.out.println("1. Livro Infantil");
            System.out.println("2. Livro Culinário");
            System.out.println("3. Livro de Viagens");
            int entradaUsuario = Controle.leInteiro();
            Controle.leString();
            switch (entradaUsuario) {
                case 1:
                    addLivroInfantil(biblioteca);
                case 2:
                    addLivroCulinario(biblioteca);
            }
        }

//        Livro livro1 = new LivroInfantil("Pequeno Príncipe","254785", "Fulano", "Um livro infantil!", "Brinquedo");
//        Livro livro2 = new LivroCulinaria("Receitas - Parte 1","125445", "Sei lá", "Receitas!", "Doce");
//        Livro livro3 = new LivroViagem("Belezas do Brasil","153785", "Cazuza", "Teste!", "Brasil");
//        biblioteca.add(livro1);
//        biblioteca.add(livro2);
//        biblioteca.add(livro3);
//        for (Livro l: biblioteca) {

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
        System.out.println("Brinde: ");
        String caracteristica = Controle.leString();
        Livro livro = new LivroCulinaria(nome, isbn, autor, resenha, caracteristica);
        biblioteca.add(livro);
        System.out.println(biblioteca.get(biblioteca.indexOf(livro)));
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
        System.out.println(biblioteca.get(biblioteca.indexOf(livro)));
    }

}
