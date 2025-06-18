package aula13;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-13-19
 */
public class Exercicio19 {
  public static void main(String[] args) {
    int[] numerosFixos = { 7, 13, 21, 33, 42, 56, 81, 99 };
    boolean encontrado = false;

    String entrada = JOptionPane.showInputDialog("Digite um número para buscar no array:");
    int numeroBusca = Integer.parseInt(entrada);

    for (int i = 0; i < numerosFixos.length; i++) {
      if (numerosFixos[i] == numeroBusca) {
        encontrado = true;
        break; // Para o laço assim que encontrar o número
      }
    }

    if (encontrado) {
      JOptionPane.showMessageDialog(null, "O número " + numeroBusca + " ESTÁ presente no array.");
    } else {
      JOptionPane.showMessageDialog(null, "O número " + numeroBusca + " NÃO ESTÁ presente no array.");
    }
  }
}