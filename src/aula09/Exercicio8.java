package aula09;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-09-08
 */
public class Exercicio8 {
  public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog("Digite um número inteiro:");
    int numero = Integer.parseInt(entrada);

    boolean ehPar = numero % 2 == 0;

    JOptionPane.showMessageDialog(null, "O número é par? " + ehPar);
  }
}