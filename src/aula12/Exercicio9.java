package aula12;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-12-09
 */
public class Exercicio9 {
  public static void main(String[] args) {
    String palavra = JOptionPane.showInputDialog("Digite uma palavra:");
    for (int i = 0; i <= 100; i++) {
      if (i % 4 == 0 && i != 0) { // i != 0 para não substituir o 0
        System.out.println(palavra);
      } else {
        System.out.println(i);
      }
    }
  }
}