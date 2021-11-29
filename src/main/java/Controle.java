import javax.swing.*;

/**
 * Classe que contém o controle de entrada dos usuários.
 */
public class Controle {
    /**
     * Método que faz a verificação se o parâmetro em formato de String é passível de ser convertido para
     * um inteiro, caso seja retorna verdadeiro, caso contrário retorna falso.
     *
     * @param intString String - Representa a String que o método tentará fazer a conversão para inteiro.
     * @return boolean - Retorna verdadeiro ou falso baseado nas validações do método.
     */
    private static boolean verificaIntEntrada(String intString) {
        try {
            Integer.parseInt(intString);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Método responsável por verificar a validação a partir do método verificaIntEntrada, e a partir
     * do retorno do mesmo devolve um inteiro como retorno ou uma mensagem de erro através de uma JOptionPane.
     *
     * @param input String - Representa a String que o método fará a conversão para inteiro, no caso de erro,
     *              retorna uma mensagem a partir da JOptionPane.
     * @return int - Retorna o valor convertido de String para inteiro.
     */
    public static int retornaInteiro(String input) {
        while (!verificaIntEntrada(input)) {
            input = JOptionPane.showInputDialog(null, "Valor incorreto!\n\nDigite um número inteiro.");
        }
        return Integer.parseInt(input);
    }
}
