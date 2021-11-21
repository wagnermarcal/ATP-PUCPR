import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Livro> biblioteca = new ArrayList<>();
        boolean isEnd = false;
        while (isEnd){
            System.out.println("1. Livro Infantil");
            System.out.println("2. Livro Culinário");
            System.out.println("3. Livro de Viagens");
            int entradaUsuario = Controle.leInteiro();
            switch (entradaUsuario){
                case 1:
                    Livro livro = new LivroInfantil();
            }
        }

//        Livro livro1 = new LivroInfantil("Pequeno Príncipe","254785", "Fulano", "Um livro infantil!", "Brinquedo");
//        Livro livro2 = new LivroCulinaria("Receitas - Parte 1","125445", "Sei lá", "Receitas!", "Doce");
//        Livro livro3 = new LivroViagem("Belezas do Brasil","153785", "Cazuza", "Teste!", "Brasil");
//        biblioteca.add(livro1);
//        biblioteca.add(livro2);
//        biblioteca.add(livro3);
//        for (Livro l: biblioteca) {
//            System.out.println(biblioteca.get(biblioteca.indexOf(l)));
//        }

    }
}
