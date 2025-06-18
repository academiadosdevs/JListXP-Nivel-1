package aula08;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-08-03
 */
public class Exercicio3 {
  public static void main(String[] args) {
    int dado = (int) (Math.random() * 6) + 1;
    JOptionPane.showMessageDialog(null, "O dado de 6 lados caiu no número: " + dado);
  }
}