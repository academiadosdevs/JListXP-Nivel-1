package aula09;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-09-02
 */
public class Exercicio2 {
  public static void main(String[] args) {
    String entrada1 = JOptionPane.showInputDialog("Digite o primeiro número:");
    int numero1 = Integer.parseInt(entrada1);

    String entrada2 = JOptionPane.showInputDialog("Digite o segundo número:");
    int numero2 = Integer.parseInt(entrada2);

    boolean primeiroEhMaior = numero1 > numero2;

    JOptionPane.showMessageDialog(null, "O primeiro número é maior que o segundo? " + primeiroEhMaior);
  }
}