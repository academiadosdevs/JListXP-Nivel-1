package aula08;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-08-07
 */
public class Exercicio7 {
  public static void main(String[] args) {
    int d20 = (int) (Math.random() * 20) + 1;
    String mensagem = String.format("Você tirou o número %d no d20.", d20);
    JOptionPane.showMessageDialog(null, mensagem);
  }
}