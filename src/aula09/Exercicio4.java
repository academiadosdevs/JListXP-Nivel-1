package aula09;

import javax.swing.JOptionPane;

/**
 * ID do exercício: XP1-09-04
 */
public class Exercicio4 {
  public static void main(String[] args) {
    String nomeA = JOptionPane.showInputDialog("Digite o primeiro nome:");
    String nomeB = JOptionPane.showInputDialog("Digite o segundo nome:");

    boolean saoIguais = nomeA.equals(nomeB);

    JOptionPane.showMessageDialog(null, "Os nomes são iguais? " + saoIguais);
  }
}