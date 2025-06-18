package aula13;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-13-23
 */
public class Exercicio23 {
  public static void main(String[] args) {
    String palavra = JOptionPane.showInputDialog("Digite uma palavra para verificar se é um palíndromo:");
    char[] letras = palavra.toCharArray();
    boolean ehPalindromo = true;

    // Compara a primeira letra com a última, a segunda com a penúltima, e assim por diante
    for (int i = 0; i < letras.length / 2; i++) {
      if (letras[i] != letras[letras.length - 1 - i]) {
        ehPalindromo = false;
        break;
      }
    }

    if (ehPalindromo) {
      JOptionPane.showMessageDialog(null, "A palavra '" + palavra + "' é um palíndromo!");
    } else {
      JOptionPane.showMessageDialog(null, "A palavra '" + palavra + "' não é um palíndromo.");
    }
  }
}