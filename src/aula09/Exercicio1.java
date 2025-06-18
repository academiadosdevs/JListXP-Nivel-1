package aula09;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-09-01
 */
public class Exercicio1 {
  public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog("Digite sua idade:");
    int idade = Integer.parseInt(entrada);

    boolean ehMaiorDeIdade = idade >= 18;

    JOptionPane.showMessageDialog(null, "É maior de idade? " + ehMaiorDeIdade);
  }
}