package aula06;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-06-07
 */
public class Exercicio7 {
  public static void main(String[] args) {
    String filme = JOptionPane.showInputDialog("Qual o melhor filme que você assistiu nos últimos 2 anos?");
    String resposta = String.format("Você escolheu o filme %s", filme);
    JOptionPane.showMessageDialog(null, resposta);
  }
}
