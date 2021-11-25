import javax.swing.*;

public class Controle {
    private static boolean verificaIntEntrada(String intString) {
        try {
            Integer.parseInt(intString);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static int retornaInteiro(String input) {
        while (!verificaIntEntrada(input)) {
            input = JOptionPane.showInputDialog(null, "Valor incorreto!\n\nDigite um número inteiro.");
        }
        return Integer.parseInt(input);
    }
}
