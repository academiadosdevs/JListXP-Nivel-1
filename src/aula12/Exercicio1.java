package aula12;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-12-01
 */
public class Exercicio1 {
  public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog("Digite seu nome:");

    for (int i = 0; i < 10; i++) {
      System.out.print(nome);
      if (i < 9) {
        System.out.print(", ");
      }
    }
  }
}