package aula12;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-12-14
 */
public class Exercicio14 {
  public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog("Digite um número para ver a tabuada:");
    int numero = Integer.parseInt(entrada);
    System.out.println("Tabuada do " + numero + ":");
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d x %d = %d\n", numero, i, (numero * i));
    }
  }
}