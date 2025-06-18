package aula07;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-07-04
 */
public class Exercicio4 {
  public static void main(String[] args) {
    String entrada = JOptionPane.showInputDialog("Valor em metros:");
    int metros = Integer.parseInt(entrada);

    int centimetros = metros * 100;
    JOptionPane.showMessageDialog(null, String.format("%dm é igual a %dcm", metros, centimetros));
  }
}
