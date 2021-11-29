import javax.swing.*;

/**
 * Classe que cont�m o controle de entrada dos usu�rios.
 */
public class Controle {
    /**
     * M�todo que faz a verifica��o se o par�metro em formato de String � pass�vel de ser convertido para
     * um inteiro, caso seja retorna verdadeiro, caso contr�rio retorna falso.
     *
     * @param intString String - Representa a String que o m�todo tentar� fazer a convers�o para inteiro.
     * @return boolean - Retorna verdadeiro ou falso baseado nas valida��es do m�todo.
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
     * M�todo respons�vel por verificar a valida��o a partir do m�todo verificaIntEntrada, e a partir
     * do retorno do mesmo devolve um inteiro como retorno ou uma mensagem de erro atrav�s de uma JOptionPane.
     *
     * @param input String - Representa a String que o m�todo far� a convers�o para inteiro, no caso de erro,
     *              retorna uma mensagem a partir da JOptionPane.
     * @return int - Retorna o valor convertido de String para inteiro.
     */
    public static int retornaInteiro(String input) {
        while (!verificaIntEntrada(input)) {
            input = JOptionPane.showInputDialog(null, "Valor incorreto!\n\nDigite um n�mero inteiro.");
        }
        return Integer.parseInt(input);
    }
}
